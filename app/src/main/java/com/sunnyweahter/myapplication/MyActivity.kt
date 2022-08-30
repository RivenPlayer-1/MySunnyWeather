package com.sunnyweahter.myapplication

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class MyActivity : AppCompatActivity() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        context = applicationContext
    }

}