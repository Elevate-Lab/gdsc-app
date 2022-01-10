package com.gdsciiita.android.data;

import java.lang.System;

/**
 * Room database to persist data for the Forage app.
 * This database stores a [Team] entity
 */
@androidx.room.Database(entities = {com.gdsciiita.android.model.Member.class, com.gdsciiita.android.model.Project.class, com.gdsciiita.android.model.Event.class}, version = 4, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/gdsciiita/android/data/MemberDatabase;", "Landroidx/room/RoomDatabase;", "()V", "eventDao", "Lcom/gdsciiita/android/data/EventDao;", "memberDao", "Lcom/gdsciiita/android/data/MemberDao;", "projectDao", "Lcom/gdsciiita/android/data/ProjectDao;", "Companion", "app_debug"})
public abstract class MemberDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.gdsciiita.android.data.MemberDatabase.Companion Companion = null;
    @kotlin.jvm.Volatile()
    private static volatile com.gdsciiita.android.data.MemberDatabase INSTANCE;
    
    public MemberDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.gdsciiita.android.data.MemberDao memberDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.gdsciiita.android.data.ProjectDao projectDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.gdsciiita.android.data.EventDao eventDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/gdsciiita/android/data/MemberDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/gdsciiita/android/data/MemberDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.gdsciiita.android.data.MemberDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}