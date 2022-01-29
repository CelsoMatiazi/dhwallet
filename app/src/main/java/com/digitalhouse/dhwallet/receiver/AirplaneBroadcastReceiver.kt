package com.digitalhouse.dhwallet.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class AirplaneBroadcastReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if(intent.action != Intent.ACTION_AIRPLANE_MODE_CHANGED){
            return
        }

        val isAirPlaneActive = intent.extras?.getBoolean("status", false) ?: return

        if(isAirPlaneActive){
            Toast.makeText(context, "Modo avião ativado", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(context, "Modo avião desativado", Toast.LENGTH_SHORT).show()
        }
    }
}