package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
        lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.text3)
        text?.text = "PIZZA"

    }

    fun onClickTest(view: View) {
        val textTest = findViewById<TextView>(R.id.textTest)
        textTest.text = "Vita moment"
    }

    fun onClickTest2 (view: View){
        val buttonTest2 = findViewById<TextView>(R.id.buttonTest2)
        buttonTest2.text = "Test"
    }

}