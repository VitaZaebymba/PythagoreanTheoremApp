package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.button.setOnClickListener {
            val result = bindingClass.edValue.text.toString()
            when (result) {

                Const.MANAGER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Const.MANAGER_SUELDO}"
                    bindingClass.tvResult.text = tempText
                }

                Const.ASSISTENT -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Const.ASSISTENT_SUELDO}"
                    bindingClass.tvResult.text = tempText
                }

                Const.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Const.DIRECTOR_SUELDO}"
                    bindingClass.tvResult.text = tempText
                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Ошибка"
                }
            }
        }

    }
    object Const {
        const val MANAGER_SUELDO = 50000
        const val ASSISTENT_SUELDO = 100000
        const val DIRECTOR_SUELDO = 110000

        const val MANAGER = "Viktor"
        const val ASSISTENT = "Petr"
        const val DIRECTOR = "Nikolay"

    }
}






