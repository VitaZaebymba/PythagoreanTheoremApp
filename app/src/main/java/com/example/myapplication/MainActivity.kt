package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickResult(view: View){

    }

    private fun isFieldEmpty(): Boolean {
        binding.apply {
            if (edA.text.isNullOrEmpty()) edA.error = "Поле должно быть заполнено"
            if (edB.text.isNullOrEmpty()) edB.error = "Поле должно быть заполнено"
            return  edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty()
        }


    }

}






