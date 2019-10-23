package com.example.uidemo.scale

import android.graphics.drawable.ScaleDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import com.example.uidemo.R
import kotlinx.android.synthetic.main.activity_scale.*

class ScaleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scale)

        imitateProgress()
    }

    private fun imitateProgress() {
        val scaleDrawable = tvDemo.background as ScaleDrawable

        val thread = HandlerThread("background")
        thread.start()

        val handler = Handler(thread.looper)
        handler.post {

            for (i in 0..10000) {
                Thread.sleep(1)
                runOnUiThread {
                    scaleDrawable.level = i
                }
            }
        }
    }
}
