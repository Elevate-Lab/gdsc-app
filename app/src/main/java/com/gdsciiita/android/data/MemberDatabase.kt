package com.gdsciiita.android.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.gdsciiita.android.model.Event
import com.gdsciiita.android.model.Member
import com.gdsciiita.android.model.Project

/**
 * Room database to persist data for the Forage app.
 * This database stores a [Team] entity
 */
@Database(entities = [Member::class, Project::class, Event::class], version = 4, exportSchema = false)
abstract class MemberDatabase : RoomDatabase() {
    abstract fun memberDao(): MemberDao
    abstract fun projectDao(): ProjectDao
    abstract fun eventDao(): EventDao

    companion object {
        @Volatile
        private var INSTANCE: MemberDatabase? = null
        fun getDatabase(context: Context): MemberDatabase {
            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MemberDatabase::class.java,
                    "member_database")
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
