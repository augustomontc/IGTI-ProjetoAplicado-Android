package com.augustomontc.igtipaa.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.augustomontc.igtipaa.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val settings = getSharedPreferences("prefs", Context.MODE_PRIVATE)
        val firstRun = settings.getBoolean("firstRun", false)
        if (!firstRun) {
            val editor = settings.edit()
            editor.putBoolean("firstRun", true)
            editor.apply()
            setContentView(R.layout.activity_splash)
            startTimer()
        } else {
            startMainActivity()
        }

    }

    // Actions
    private fun startTimer() {
        Handler().postDelayed({
            startMainActivity()
        }, 4000)
    }

    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}