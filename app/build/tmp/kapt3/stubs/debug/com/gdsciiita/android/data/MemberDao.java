package com.gdsciiita.android.data;

import java.lang.System;

/**
 * Data Access Object for database interaction.
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\bH\'J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\b2\u0006\u0010\u000e\u001a\u00020\nH\'J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/gdsciiita/android/data/MemberDao;", "", "delete", "", "member", "Lcom/gdsciiita/android/model/Member;", "(Lcom/gdsciiita/android/model/Member;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMember", "Lkotlinx/coroutines/flow/Flow;", "id", "", "getMembers", "", "getSubTeam", "team", "insert", "update", "app_debug"})
public abstract interface MemberDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from member_database ORDER BY id ASC")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.gdsciiita.android.model.Member>> getMembers();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from member_database WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<com.gdsciiita.android.model.Member> getMember(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * from member_database WHERE team = :team")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.gdsciiita.android.model.Member>> getSubTeam(int team);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.gdsciiita.android.model.Member member, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.gdsciiita.android.model.Member member, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.gdsciiita.android.model.Member member, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}