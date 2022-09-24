package com.example.workmanager

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentService : IntentService("MyIntentService"){

    companion object{
        val TAG = "MyIntentService"

        private lateinit var myIntentService: MyIntentService
        var running = false

        fun stopService(){
            Log.v(TAG,"SERVICE STOPPED")
            running = false
            myIntentService.stopSelf()
        }

    }
    init {
        myIntentService = this
    }


    override fun onHandleIntent(p0: Intent?) {
        try {
            running = true
            while (running){
                Log.v(TAG,"SERVICE RUNNING")
                Thread.sleep(1000)
            }
        }catch (e :InterruptedException){
            Thread.currentThread().interrupt()
        }

    }


}