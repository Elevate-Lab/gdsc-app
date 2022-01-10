package com.gdsciiita.android.data

import androidx.room.*
import com.gdsciiita.android.model.Event
import com.gdsciiita.android.model.Member
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for database interaction.
 */
@Dao
interface EventDao {

    @Query("SELECT * from events ORDER BY id ASC")
    fun getEvents(): Flow<List<Event>>

    @Query("SELECT * from events WHERE id = :id")
    fun getEvent(id: Int): Flow<Event>

    @Query("SELECT * from events WHERE status = :status")
    fun getSubEvent(status: Int): Flow<List<Event>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(project: Event)

    @Update
    suspend fun update(project: Event)

    @Delete
    suspend fun delete(project: Event)
}
