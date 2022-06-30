package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("My Log", "OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("My Log", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("My Log", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("My Log", "OnPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("My Log", "OnDestroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("My Log", "OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("My Log", "OnRestart")
    }
}