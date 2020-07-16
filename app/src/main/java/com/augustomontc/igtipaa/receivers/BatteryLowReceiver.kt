package com.augustomontc.igtipaa.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BatteryLowReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Intent.ACTION_BATTERY_LOW -> handleBatteryLow(context)
        }
    }

    private fun handleBatteryLow(context: Context?) {
        Toast.makeText(context, "Atention!! Battery is low!", Toast.LENGTH_SHORT).show();
    }
}