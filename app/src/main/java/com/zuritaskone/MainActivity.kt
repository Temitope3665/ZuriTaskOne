package com.zuritaskone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var increaseBtn: Button
    lateinit var number: TextView

    var startCounting: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        increaseBtn = findViewById(R.id.increase_btn)
        number = findViewById(R.id.display_number)

        increaseBtn.setOnClickListener {

            startCounting++

            number.text = startCounting.toString()

        }

    }

}
