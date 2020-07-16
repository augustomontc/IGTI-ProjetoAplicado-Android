package com.augustomontc.igtipaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "MainActivity Created")
        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.proxima_tela_btn)
        mButton.setOnClickListener {
            startTela2Activity()
        }
    }

    private fun startTela2Activity() {
        val intent = Intent(this, Tela2Activity::class.java)
        intent.putExtra("aluno", "Augusto Monteiro")
        startActivity(intent)
    }

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