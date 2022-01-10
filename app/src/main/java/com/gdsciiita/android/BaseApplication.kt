package com.gdsciiita.android

import android.app.Application
import com.gdsciiita.android.data.MemberDatabase

/**
 * An application class that inherits from [Application], allows for the creation of a singleton
 * instance of the [MemberDatabase]
 */
class BaseApplication : Application() {
    val database: MemberDatabase by lazy { MemberDatabase.getDatabase(this) }
}