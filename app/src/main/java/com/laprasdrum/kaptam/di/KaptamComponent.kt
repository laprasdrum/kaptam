package com.laprasdrum.kaptam.di

import com.laprasdrum.kaptam.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AndroidModule::class))
public interface KaptamComponent {
    fun inject(activity: MainActivity)
}