package com.gdsciiita.android.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.gdsciiita.android.data.ProjectDao
import com.gdsciiita.android.model.Project
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.google.firebase.database.DatabaseError

import com.google.firebase.database.DataSnapshot

import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.DatabaseReference

import com.google.firebase.database.FirebaseDatabase

class ProjectViewModel (private val projectDao: ProjectDao) : ViewModel() {
    val allProjects: LiveData<List<Project>> = projectDao.getProjects().asLiveData()

    var database = FirebaseDatabase.getInstance()
    var myRef = database.getReference("Projects")

    fun getProject(id: Int): LiveData<Project> {
        return projectDao.getProject(id).asLiveData()
    }

    fun getProjects() {
        myRef.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                dataSnapshot.children.forEach { snapshot ->
                    addProject(snapshot.child("ID").value.toString().toInt(),
                        snapshot.child("name").value.toString(),
                        snapshot.child("desc").value.toString(),
                        snapshot.child("logo").value.toString(),
                        snapshot.child("github").value.toString(),
                        snapshot.child("link").value.toString()
                    )
                }
            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
            }
        })
    }

    fun addProject(
        id: Int,
        name: String,
        desc: String,
        logo: String,
        github: String,
        link: String
    ) {
        val project = Project(
            id = id,
            name = name,
            desc = desc,
            logo = logo,
            github = github,
            link = link
        )

        viewModelScope.launch {
            projectDao.insert(project)
        }
    }

    fun updateProject(
        id: Int,
        name: String,
        desc: String,
        logo: String,
        github: String,
        link: String
    ) {
        val project = Project(
            id = id,
            name = name,
            desc = desc,
            logo = logo,
            github = github,
            link = link
        )

        viewModelScope.launch(Dispatchers.IO) {
            projectDao.update(project)
        }
    }

    fun deleteProject(project: Project) {
        viewModelScope.launch(Dispatchers.IO) {
            projectDao.delete(project)
        }
    }

    fun isValidEntry(name: String, type: String): Boolean {
        return name.isNotBlank() && type.isNotBlank()
    }
}

class ProjectViewModelFactory(private val projectDao: ProjectDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProjectViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ProjectViewModel(projectDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}