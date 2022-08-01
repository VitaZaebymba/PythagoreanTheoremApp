package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.constance.Const
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.button.setOnClickListener {
            val result = bindingClass.edValue.text.toString()
            bindingClass.imageView.visibility = View.VISIBLE

            when (result) {

                Const.MANAGER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Const.MANAGER_SUELDO}"
                    if(bindingClass.pswd.text.toString() == Const.MANAGER_PASSWORD){
                    bindingClass.tvResult.text = tempText
                    bindingClass.imageView.setImageResource(R.drawable.viktor)
                    }
                    else  bindingClass.tvResult.text = "Неверный код"
                }

                Const.ASSISTENT -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Const.ASSISTENT_SUELDO}"
                    if(bindingClass.pswd.text.toString() == Const.ASSISTENT_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.petr)
                    }
                    else  bindingClass.tvResult.text = "Неверный код"
                }

                Const.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Const.DIRECTOR_SUELDO}"
                    if(bindingClass.pswd.text.toString() == Const.DIRECTOR_PASSWORD){
                        bindingClass.tvResult.text = tempText
                        bindingClass.imageView.setImageResource(R.drawable.nikolay)
                    }
                    else  bindingClass.tvResult.text = "Неверный код"
                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Ошибка"
                }
            }
        }

    }

}






