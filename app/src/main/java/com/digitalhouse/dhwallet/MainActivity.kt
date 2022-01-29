package com.digitalhouse.dhwallet

import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.net.wifi.WifiManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.digitalhouse.dhwallet.receiver.AirplaneBroadcastReceiver
import com.digitalhouse.dhwallet.receiver.InternetBroadcastReceiver


class MainActivity : AppCompatActivity(R.layout.activity_main){

    lateinit var receiverAirPlane: AirplaneBroadcastReceiver
    lateinit var receiverInternet: InternetBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        receiverAirPlane = AirplaneBroadcastReceiver()
        IntentFilter().apply {
            addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
            registerReceiver(receiverAirPlane, this)
        }


        receiverInternet = InternetBroadcastReceiver()
        IntentFilter().apply {
            addAction(WifiManager.SUPPLICANT_CONNECTION_CHANGE_ACTION)
            registerReceiver(receiverInternet, this)
        }


    }


    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiverAirPlane)
        unregisterReceiver(receiverInternet)
    }

}

