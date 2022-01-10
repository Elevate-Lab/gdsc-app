package com.gdsciiita.android.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.gdsciiita.android.data.MemberDao
import com.gdsciiita.android.model.Member
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.google.firebase.database.DatabaseError

import com.google.firebase.database.DataSnapshot

import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.DatabaseReference

import com.google.firebase.database.FirebaseDatabase

class TeamViewModel (private val memberDao: MemberDao) : ViewModel() {
    val allMembers: LiveData<List<Member>> = memberDao.getMembers().asLiveData()

    fun getSubTeam(team: Int) : LiveData<List<Member>> {
        return memberDao.getSubTeam(team).asLiveData()
    }

    var database = FirebaseDatabase.getInstance()
    var myRef = database.getReference("Members")

    fun getMember(id: Int): LiveData<Member> {
        return memberDao.getMember(id).asLiveData()
    }

    fun getData() {
        Log.i("GETTING", "DDDD")
        viewModelScope.apply {

            myRef.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    dataSnapshot.children.forEach { snapshot ->
                        addMember(
                            snapshot.child("ID").value.toString().toInt(),
                            snapshot.child("name").value.toString(),
                            snapshot.child("type").value.toString().toInt(),
                            snapshot.child("team").value.toString().toInt(),
                            snapshot.child("designation").value.toString(),
                            snapshot.child("profile_pic").value.toString()
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                }
            })
        }
    }

    fun addMember(
        id: Int,
        name: String,
        type: Int,
        team: Int,
        designation: String,
        profilePic: String
    ) {
        val member = Member(
            id = id,
            name = name,
            type = type,
            team = team,
            designation = designation,
            profilePic = profilePic
        )

        viewModelScope.launch {
            memberDao.insert(member)
        }
    }

    fun updateMember(
        id: Int,
        name: String,
        type: Int,
        team: Int,
        designation: String,
        profilePic: String
    ) {
        val member = Member(
            id = id,
            name = name,
            type = type,
            team = team,
            designation = designation,
            profilePic = profilePic
        )

        viewModelScope.launch(Dispatchers.IO) {
            memberDao.update(member)
        }
    }

    fun deleteMember(member: Member) {
        viewModelScope.launch(Dispatchers.IO) {
            memberDao.delete(member)
        }
    }

    fun isValidEntry(name: String, type: String): Boolean {
        return name.isNotBlank() && type.isNotBlank()
    }
}

class TeamViewModelFactory(private val memberDao: MemberDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TeamViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TeamViewModel(memberDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}