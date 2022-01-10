package com.gdsciiita.android.data

import androidx.room.*
import com.gdsciiita.android.model.Project
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for database interaction.
 */
@Dao
interface ProjectDao {

    @Query("SELECT * from projects ORDER BY id ASC")
    fun getProjects(): Flow<List<Project>>

    @Query("SELECT * from projects WHERE id = :id")
    fun getProject(id: Int): Flow<Project>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(project: Project)

    @Update
    suspend fun update(project: Project)

    @Delete
    suspend fun delete(project: Project)
}
