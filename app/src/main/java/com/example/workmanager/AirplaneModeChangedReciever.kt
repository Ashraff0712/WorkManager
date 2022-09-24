package com.example.workmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReciever:BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplanModeEnabled = intent?.getBooleanExtra("state",false)?: return
        if(isAirplanModeEnabled){
            Toast.makeText(context,"Ash Airplane Mode enabled",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(context,"Ash Airplane Mode disabled",Toast.LENGTH_LONG).show()
        }
    }
}