package com.example.plugin_codek


//import com.example.plugin_codek.model.User
//import com.example.plugin_codek.view.ArticleView

//import androidx.appcompat.app.AppCompatActivity
import android.app.Application
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import timber.log.Timber

class App : Application() {
    fun onCreate() {
        super.onCreate()
        // Log
        Timber.plant(DebugTree())
    }
}