package com.gdsciiita.android.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gdsciiita.android.constants.MemberType

/**
 * Forageable entity to be stored in the forageable_database.
 */
@Entity(tableName = "member_database")
data class Member(
    @PrimaryKey
    val id: Int,
    val name: String,
    val type: Int,
    val team: Int,
    val designation: String,
    @ColumnInfo(name = "profile_pic")
    val profilePic: String
)
