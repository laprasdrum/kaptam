package com.laprasdrum.kaptam.di

import android.app.Application

object Injector {
    lateinit private var componentInternal: KaptamComponent

    public val component: KaptamComponent
        get() = componentInternal

    public fun init(application: Application) {
        componentInternal = DaggerKaptamComponent.builder()
                .androidModule(AndroidModule(application))
                .build()
    }
}
