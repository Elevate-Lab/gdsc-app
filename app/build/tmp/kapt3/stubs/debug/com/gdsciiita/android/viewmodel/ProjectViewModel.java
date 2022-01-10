package com.gdsciiita.android.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J6\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\bJ\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010$\u001a\u00020\u0018J\u0016\u0010%\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u001cJ6\u0010(\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001cR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/gdsciiita/android/viewmodel/ProjectViewModel;", "Landroidx/lifecycle/ViewModel;", "projectDao", "Lcom/gdsciiita/android/data/ProjectDao;", "(Lcom/gdsciiita/android/data/ProjectDao;)V", "allProjects", "Landroidx/lifecycle/LiveData;", "", "Lcom/gdsciiita/android/model/Project;", "getAllProjects", "()Landroidx/lifecycle/LiveData;", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "getDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "myRef", "Lcom/google/firebase/database/DatabaseReference;", "getMyRef", "()Lcom/google/firebase/database/DatabaseReference;", "setMyRef", "(Lcom/google/firebase/database/DatabaseReference;)V", "addProject", "", "id", "", "name", "", "desc", "logo", "github", "link", "deleteProject", "project", "getProject", "getProjects", "isValidEntry", "", "type", "updateProject", "app_debug"})
public final class ProjectViewModel extends androidx.lifecycle.ViewModel {
    private final com.gdsciiita.android.data.ProjectDao projectDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.gdsciiita.android.model.Project>> allProjects = null;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.database.FirebaseDatabase database;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.database.DatabaseReference myRef;
    
    public ProjectViewModel(@org.jetbrains.annotations.NotNull()
    com.gdsciiita.android.data.ProjectDao projectDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.gdsciiita.android.model.Project>> getAllProjects() {
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
    public final androidx.lifecycle.LiveData<com.gdsciiita.android.model.Project> getProject(int id) {
        return null;
    }
    
    public final void getProjects() {
    }
    
    public final void addProject(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String desc, @org.jetbrains.annotations.NotNull()
    java.lang.String logo, @org.jetbrains.annotations.NotNull()
    java.lang.String github, @org.jetbrains.annotations.NotNull()
    java.lang.String link) {
    }
    
    public final void updateProject(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String desc, @org.jetbrains.annotations.NotNull()
    java.lang.String logo, @org.jetbrains.annotations.NotNull()
    java.lang.String github, @org.jetbrains.annotations.NotNull()
    java.lang.String link) {
    }
    
    public final void deleteProject(@org.jetbrains.annotations.NotNull()
    com.gdsciiita.android.model.Project project) {
    }
    
    public final boolean isValidEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return false;
    }
}