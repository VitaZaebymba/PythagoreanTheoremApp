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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    bindingClass.button.setOnClickListener {
        val result = bindingClass.edValue.text.toString().toInt()
        when(result){

            in 0..100 -> {
                bindingClass.tvResult.visibility = View.VISIBLE
                bindingClass.tvResult.text = "Нубяра полная"
            }

            in 101..1000 -> {
                bindingClass.tvResult.visibility = View.VISIBLE
                bindingClass.tvResult.text = "Начинающий"
            }

            in 1001..100000 -> {
                bindingClass.tvResult.visibility = View.VISIBLE
                bindingClass.tvResult.text = "Продвинутый"
            }

            in 100001..500000 -> {
                bindingClass.tvResult.visibility = View.VISIBLE
                bindingClass.tvResult.text = "Бывалый"
            }

            in 500001..1000000 -> {
                bindingClass.tvResult.visibility = View.VISIBLE
                bindingClass.tvResult.text = "Профи"
            }

            else ->{
                bindingClass.tvResult.visibility = View.VISIBLE
                bindingClass.tvResult.text = "Звезда!"

            }
        }



        }


    }



}