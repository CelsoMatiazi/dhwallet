package com.digitalhouse.dhwallet.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.widget.Toast

class InternetBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {

        val cm = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activityNetwork = cm.activeNetwork

        if(activityNetwork != null){
            val capabilities = cm.getNetworkCapabilities(activityNetwork)

            val message =  capabilities?.let {
                when{
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> "WIFI Ativo"
                    capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> "4G Ativo"
                    else -> "Sem internet"
                }
            }

            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()

        }else{
            Toast.makeText(context, "Desconectado", Toast.LENGTH_SHORT).show()
        }
    }
}