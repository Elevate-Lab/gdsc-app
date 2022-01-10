package com.gdsciiita.android;

import java.lang.System;

/**
 * An application class that inherits from [Application], allows for the creation of a singleton
 * instance of the [MemberDatabase]
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/gdsciiita/android/BaseApplication;", "Landroid/app/Application;", "()V", "database", "Lcom/gdsciiita/android/data/MemberDatabase;", "getDatabase", "()Lcom/gdsciiita/android/data/MemberDatabase;", "database$delegate", "Lkotlin/Lazy;", "app_debug"})
public final class BaseApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy database$delegate = null;
    
    public BaseApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gdsciiita.android.data.MemberDatabase getDatabase() {
        return null;
    }
}