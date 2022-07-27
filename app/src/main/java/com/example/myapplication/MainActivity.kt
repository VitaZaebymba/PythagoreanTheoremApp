package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
        lateinit var tv: TextView
        lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textTest)
        button =findViewById(R.id.buttonTest)

       button.setOnClickListener {
            tv.text = "Vita moment"
       }

    }

    override fun onPause() {
        super.onPause()
    }

}