package com.gdsciiita.android.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.gdsciiita.android.data.EventDao
import com.gdsciiita.android.model.Event
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.google.firebase.database.DatabaseError

import com.google.firebase.database.DataSnapshot

import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.DatabaseReference

import com.google.firebase.database.FirebaseDatabase

class EventViewModel (private val eventDao: EventDao) : ViewModel() {
    val allEvents: LiveData<List<Event>> = eventDao.getEvents().asLiveData()

    fun getSubEvent(status: Int) : LiveData<List<Event>> {
        return eventDao.getSubEvent(status).asLiveData()
    }

    var database = FirebaseDatabase.getInstance()
    var myRef = database.getReference("Events")

    fun getEvent(id: Int): LiveData<Event> {
        return eventDao.getEvent(id).asLiveData()
    }

    fun getData() {
        viewModelScope.apply {
            myRef.addValueEventListener(object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    dataSnapshot.children.forEach { snapshot ->
                        addEvent(
                            snapshot.child("ID").value.toString().toInt(),
                            snapshot.child("name").value.toString(),
                            snapshot.child("desc").value.toString(),
                            snapshot.child("logo").value.toString(),
                            snapshot.child("date").value.toString(),
                            snapshot.child("link").value.toString(),
                            snapshot.child("status").value.toString().toInt()
                        )
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    // Failed to read value
                }
            })
        }
    }

    fun addEvent(
        id: Int,
        name: String,
        desc: String,
        logo: String,
        date: String,
        link: String,
        status: Int
    ) {
        val event = Event(
            id = id,
            name = name,
            desc = desc,
            logo = logo,
            date = date,
            link = link,
            status = status
        )

        viewModelScope.launch {
            eventDao.insert(event)
        }
    }

    fun updateEvent(
        id: Int,
        name: String,
        desc: String,
        logo: String,
        date: String,
        link: String,
        status: Int
    ) {
        val event = Event(
            id = id,
            name = name,
            desc = desc,
            logo = logo,
            date = date,
            link = link,
            status = status
        )

        viewModelScope.launch(Dispatchers.IO) {
            eventDao.update(event)
        }
    }

    fun deleteEvent(event: Event) {
        viewModelScope.launch(Dispatchers.IO) {
            eventDao.delete(event)
        }
    }

    fun isValidEntry(name: String, type: String): Boolean {
        return name.isNotBlank() && type.isNotBlank()
    }
}

class EventViewModelFactory(private val eventDao: EventDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EventViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return EventViewModel(eventDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}