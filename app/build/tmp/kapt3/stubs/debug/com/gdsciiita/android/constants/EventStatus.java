package com.gdsciiita.android.constants;

import java.lang.System;

/**
 * Object for items types. Applied to the MenuItem object.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/gdsciiita/android/constants/EventStatus;", "", "()V", "ONGOING", "", "getONGOING", "()I", "PAST", "getPAST", "UPCOMING", "getUPCOMING", "app_debug"})
public final class EventStatus {
    @org.jetbrains.annotations.NotNull()
    public static final com.gdsciiita.android.constants.EventStatus INSTANCE = null;
    private static final int UPCOMING = 1;
    private static final int PAST = 2;
    private static final int ONGOING = 3;
    
    private EventStatus() {
        super();
    }
    
    public final int getUPCOMING() {
        return 0;
    }
    
    public final int getPAST() {
        return 0;
    }
    
    public final int getONGOING() {
        return 0;
    }
}