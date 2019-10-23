package com.example.uidemo.clip

import android.graphics.drawable.ClipDrawable
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import androidx.appcompat.app.AppCompatActivity
import com.example.uidemo.R
import kotlinx.android.synthetic.main.activity_clip.*

class ClipActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clip)

        val clipDrawable = ivProgressBar.drawable as ClipDrawable

        imitateProgress(clipDrawable)
    }

    private fun imitateProgress(clipDrawable: ClipDrawable) {
        val thread = HandlerThread("background")
        thread.start()

        val handler = Handler(thread.looper)
        handler.post {
            for (i in 0..10000) {
                Thread.sleep(1)
                runOnUiThread {
                    clipDrawable.setLevel(i)
                }
            }
        }
    }
}
