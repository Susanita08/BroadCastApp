package com.curso.android.broadcastapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != null &&
            intent.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {

            val isAirplaneModeOn = intent.getBooleanExtra("state", false)
            val msg = if (isAirplaneModeOn) {
                "Airplane mode is on"
            } else {
                "Airplane mode is off"
            }
            Toast.makeText(context, ""+msg, Toast.LENGTH_SHORT).show()
        }
    }
}