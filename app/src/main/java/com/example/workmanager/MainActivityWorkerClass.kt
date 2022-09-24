package com.example.workmanager

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

private const val  TAG = "MainActivityWorkerClass"
class MainActivityWorkerClass(appContext: Context, workerParameters: WorkerParameters):
Worker(appContext, workerParameters){
    override fun doWork(): Result {
        val data = inputData.getString("DATA")
        Log.v(TAG,"doWork")

        if(data!= null){
            Log.v(TAG,data)
        }
        return Result.success()
    }
}