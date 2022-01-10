package com.gdsciiita.android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\bJ\u0006\u0010#\u001a\u00020\u0018J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u001e\u001a\u00020\u001aJ\u0016\u0010&\u001a\u00020\'2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ6\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006)"}, d2 = {"Lcom/gdsciiita/android/viewmodel/TeamViewModel;", "Landroidx/lifecycle/ViewModel;", "memberDao", "Lcom/gdsciiita/android/data/MemberDao;", "(Lcom/gdsciiita/android/data/MemberDao;)V", "allMembers", "Landroidx/lifecycle/LiveData;", "", "Lcom/gdsciiita/android/model/Member;", "getAllMembers", "()Landroidx/lifecycle/LiveData;", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "myRef", "Lcom/google/firebase/database/DatabaseReference;", "getMyRef", "()Lcom/google/firebase/database/DatabaseReference;", "setMyRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "addMember", "", "id", "", "name", "", "type", "team", "designation", "profilePic", "deleteMember", "member", "getData", "getMember", "getSubTeam", "isValidEntry", "", "updateMember", "app_debug"})
public final class TeamViewModel extends androidx.lifecycle.ViewModel {
    private final com.gdsciiita.android.data.MemberDao memberDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.gdsciiita.android.model.Member>> allMembers = null;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.database.FirebaseDatabase database;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.database.DatabaseReference myRef;
    
    public TeamViewModel(@org.jetbrains.annotations.NotNull()
    com.gdsciiita.android.data.MemberDao memberDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.gdsciiita.android.model.Member>> getAllMembers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.gdsciiita.android.model.Member>> getSubTeam(int team) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.FirebaseDatabase getDatabase() {
        return null;
    }
    
    public final void setDatabase(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getMyRef() {
        return null;
    }
    
    public final void setMyRef(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gdsciiita.android.model.Member> getMember(int id) {
        return null;
    }
    
    public final void getData() {
    }
    
    public final void addMember(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int type, int team, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    java.lang.String profilePic) {
    }
    
    public final void updateMember(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int type, int team, @org.jetbrains.annotations.NotNull()
    java.lang.String designation, @org.jetbrains.annotations.NotNull()
    java.lang.String profilePic) {
    }
    
    public final void deleteMember(@org.jetbrains.annotations.NotNull()
    com.gdsciiita.android.model.Member member) {
    }
    
    public final boolean isValidEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return false;
    }
}