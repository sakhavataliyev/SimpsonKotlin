package com.aliyev.simpsonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun textAdd(view: View){

        val name = textName.text.toString()
        var age = textAge.text.toString().toIntOrNull()
        if (age == null){
            age = 0
        }

        val job = textJob.text.toString()

        val simpson = Simpson(name, age, job)

        textResult.text = "Name: ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"

    }

}