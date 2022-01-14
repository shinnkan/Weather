package com.example.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "4QC3wY8xYaVAgSiL"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}