package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var bindingClass: ActivityMainBinding
     val maxPerson = 90
     val currentPerson = 35

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.b1.setOnClickListener {

            if (maxPerson > currentPerson){
                bindingClass.txRes.text = "Всё ок"
                bindingClass.txRes.setBackgroundColor(Color.GREEN)
            }

            else {
                bindingClass.txRes.text = "Превышено"
                bindingClass.txRes.setBackgroundColor(Color.RED)
            }

        }

        bindingClass.b2.setOnClickListener {

        }

        bindingClass.b3.setOnClickListener {

        }


    }

    override fun onPause() {
        super.onPause()
    }

}