package com.laprasdrum.kaptam

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.laprasdrum.kaptam.di.Injector
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inject()
        trySomeActionsAfterInjection()
    }

    private fun inject() {
        // inject component with Kotlin injector
        Injector.component.inject(this)

        // ... or inject component with Java injector
        // InjectorJava.component().inject(this)
    }

    private fun trySomeActionsAfterInjection() {
        sharedPreferences.edit().run {
            clear()
            putInt("day", 20)
            putString("kotlin", "(\\( ・8・)/)")
            apply()
        }

        val message: TextView = findViewById(R.id.message) as TextView
        sharedPreferences.all.entries.forEach {
            message.append("\n${it.key}: ${it.value}")
        }
    }
}
