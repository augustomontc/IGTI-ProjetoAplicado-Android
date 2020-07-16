package com.augustomontc.igtipaa.activities
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.augustomontc.igtipaa.R
import com.augustomontc.igtipaa.receivers.BatteryLowReceiver

class Tela2Activity : AppCompatActivity() {
    var myName: String = ""
    private val receiver =
        BatteryLowReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        setLabelName()
        registerBatteryLowReceiver()
    }

    // Setup UI/UX
    private fun setLabelName() {
        myName = intent.getStringExtra("myName") as String
        val txtMyName = findViewById<TextView>(R.id.txtMyName)
        txtMyName.text = "My name is $myName"
    }

    private fun registerBatteryLowReceiver() {
        val filter = IntentFilter(Intent.ACTION_BATTERY_LOW)
        registerReceiver(receiver, filter)
    }
}