package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var bindingClass: ActivityMainBinding
     val a = 324
     val b = 34

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.b1.setOnClickListener {
            val result = a + b
            bindingClass.txRes.text = result.toString()
        }
        bindingClass.b2.setOnClickListener {
            val result = a - b
            bindingClass.txRes.text = result.toString()
        }
        bindingClass.b3.setOnClickListener {
            val result = a * b
            bindingClass.txRes.text = result.toString()
        }


    }

    override fun onPause() {
        super.onPause()
    }

}