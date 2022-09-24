package com.example.workmanager

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.work.*
import java.util.concurrent.TimeUnit
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val start = findViewById<Button>(R.id.start)
        val stop = findViewById<Button>(R.id.stop)
        val info = findViewById<TextView>(R.id.info)


        start.setOnClickListener{
            Intent(this,MyIntentService::class.java).also {
                startService(it)
                info.text = "Service Running"
            }
        }
        stop.setOnClickListener{
            MyIntentService.stopService()
            info.text = "Service Stopped"
        }

//        val data = Data.Builder().putString("DATA","INIT").build()
//        //creating multiple workRequests
//        val yourWorkRequest1 = OneTimeWorkRequest.Builder(MainActivityWorkerClass::class.java).build()
//        val yourWorkRequest2 = OneTimeWorkRequest.Builder(MainActivityWorkerClass::class.java).build()
//        val yourWorkRequest3 = OneTimeWorkRequest.Builder(MainActivityWorkerClass::class.java).build()
//        val yourWorkRequest4 = OneTimeWorkRequest.Builder(MainActivityWorkerClass::class.java).build()
//        WorkManager.getInstance(this).beginWith(yourWorkRequest1).then(yourWorkRequest2).enqueue()
//        val constraints = Constraints.Builder()
//            .setRequiredNetworkType(NetworkType.UNMETERED)
//            .setRequiresCharging(false)
//            .build()
//        val yourWorkRequest = OneTimeWorkRequest.Builder(MainActivityWorkerClass::class.java).
//                setConstraints(constraints).build()
//                WorkManager.getInstance(this).enqueue(yourWorkRequest)

        //PeriodicWorkRequest
//        val yourWorkRequest = PeriodicWorkRequest.Builder(MainActivityWorkerClass::class.java,20,TimeUnit.MINUTES)
//        WorkManager.getInstance(this).enqueueUniquePeriodicWork(TAG,ExistingPeriodicWorkPolicy.KEEP,yourWorkRequest.build())

//        WorkManager.getInstance(this).getWorkInfoByIdLiveData(yourWorkRequest1.id).observe(this,
//            Observer { if (it!=null && it.state == WorkInfo.State.SUCCEEDED ){
//                Log.v(TAG,"success")
//            }
//            })
    }
}