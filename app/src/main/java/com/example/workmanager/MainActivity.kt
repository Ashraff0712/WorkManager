package com.example.workmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //One Time Work Request with initial delay
        val yourWorkRequest = OneTimeWorkRequest.Builder(MainActivityWorkerClass::class.java).
                setInitialDelay(10,TimeUnit.SECONDS).build()
                WorkManager.getInstance(this).enqueue(yourWorkRequest)
    }
}