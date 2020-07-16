package com.augustomontc.igtipaa.activities

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.augustomontc.igtipaa.R
import com.augustomontc.igtipaa.receivers.BatteryLowReceiver

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private val receiver =
        BatteryLowReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "MainActivity Created")
        setContentView(R.layout.activity_main)

        registerBatteryLowReceiver()
        createButton()
    }

    // Setup UI/UX
    private fun registerBatteryLowReceiver() {
        val filter = IntentFilter(Intent.ACTION_BATTERY_LOW)
        registerReceiver(receiver, filter)
    }

    private fun createButton() {
        val mButton = findViewById<Button>(R.id.btnNextActivity)
        mButton.setOnClickListener {
            startTela2Activity()
        }
    }

    // Actions
    private fun startTela2Activity() {
        val intent = Intent(this, Tela2Activity::class.java)
        intent.putExtra("myName", "Augusto Monteiro")
        startActivity(intent)
    }

    // Life cycle tests
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "MainActivity Started")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "MainActivity Restarted")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "MainActivity Paused")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "MainActivity Stopped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "MainActivity Destroyed")
    }

}