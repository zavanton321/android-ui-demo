package com.example.uidemo.level_list

import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import androidx.appcompat.app.AppCompatActivity
import com.example.uidemo.R
import kotlinx.android.synthetic.main.activity_level_list.*

class LevelListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_list)

        imitateProgressWithTime()
    }

    private fun imitateProgressWithTime() {
        val handlerThread = HandlerThread("background")
        handlerThread.start()

        val handler = Handler(handlerThread.looper)

        handler.post {

            var count = 0
            while (true) {
                Thread.sleep(10)
                runOnUiThread {
                    count++
                    ivProgress.setImageLevel(count % 100)
                }
            }
        }
    }
}
