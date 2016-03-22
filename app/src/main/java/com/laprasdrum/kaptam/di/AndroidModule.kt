package com.laprasdrum.kaptam.di

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.laprasdrum.kaptam.annotation.ForApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AndroidModule(private var application: Application) {
    @Provides @Singleton @ForApplication fun provideApplication(): Application {
        return application
    }

    @Provides @Singleton fun provideApplicationContext(): Context {
        return application.applicationContext
    }

    @Provides @Singleton fun provideDefaultSharedPreferences(): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }
}
