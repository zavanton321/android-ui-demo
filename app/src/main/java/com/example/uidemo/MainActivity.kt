package com.example.uidemo

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val demo: LinearLayout? = null

        val count = demo?.childCount ?: 0

        for (i in 0..count) {
            val result = demo?.getChildAt(i)
        }
    }
}