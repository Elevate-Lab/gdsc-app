package com.gdsciiita.android.data

import androidx.room.*
import com.gdsciiita.android.model.Member
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object for database interaction.
 */
@Dao
interface MemberDao {

    @Query("SELECT * from member_database ORDER BY id ASC")
    fun getMembers(): Flow<List<Member>>

    @Query("SELECT * from member_database WHERE id = :id")
    fun getMember(id: Int): Flow<Member>

    @Query("SELECT * from member_database WHERE team = :team")
    fun getSubTeam(team: Int): Flow<List<Member>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(member: Member)

    @Update
    suspend fun update(member: Member)

    @Delete
    suspend fun delete(member: Member)
}
