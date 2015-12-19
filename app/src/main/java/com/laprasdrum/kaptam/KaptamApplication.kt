package com.laprasdrum.kaptam

import android.app.Application
import com.laprasdrum.kaptam.di.Injector

class KaptamApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        // use injector from Kotlin file
        Injector.init(this)

        // ... or use injector from Java file
        // InjectorJava.init(this)
    }
}
