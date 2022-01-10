package com.gdsciiita.android.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "events")
data class Event(
    @PrimaryKey
    val id: Int,
    val name: String,
    val desc: String,
    val logo: String,
    val date: String,
    val link: String,
    val status: Int
)
