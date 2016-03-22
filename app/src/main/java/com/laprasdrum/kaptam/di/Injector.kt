package com.laprasdrum.kaptam.di

import android.app.Application

object Injector {
    lateinit private var componentInternal: KaptamComponent

    val component: KaptamComponent
        get() = componentInternal

    fun init(application: Application) {
        componentInternal = DaggerKaptamComponent.builder()
                .androidModule(AndroidModule(application))
                .build()
    }
}
