package com.example.workmanager

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class MainActivityWorkerClass(appContext: Context, workerParameters: WorkerParameters):
Worker(appContext, workerParameters){
    override fun doWork(): Result {
        return Result.success()
    }
}