package com.example.skillbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn_1)
        val btn2 = findViewById<Button>(R.id.btn_2)
        val btn3 = findViewById<Button>(R.id.btn_3)

        btn1.setOnClickListener {
            Log.d("CLICK", "Кнопочка 1")
        }
        btn2.setOnClickListener {
            Log.d("CLICK", "Кнопочка 2")
        }
        btn3.setOnClickListener {
            Log.d("CLICK", "Кнопочка 3")
        }
    }
}