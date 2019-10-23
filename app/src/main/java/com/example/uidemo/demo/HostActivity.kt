package com.example.uidemo.demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.uidemo.R

class HostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)

        Log.d("zavanton", "zavanton - activity onCreate")

        if (savedInstanceState == null) {
            if (supportFragmentManager.findFragmentById(R.id.fmtContainer) == null) {
                supportFragmentManager.beginTransaction()
                    .add(R.id.fmtContainer, DemoFragment.newInstance())
                    .commit()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("zavanton", "zavanton - activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("zavanton", "zavanton - activity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("zavanton", "zavanton - activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("zavanton", "zavanton - activity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("zavanton", "zavanton - activity onDestroy")
    }
}
