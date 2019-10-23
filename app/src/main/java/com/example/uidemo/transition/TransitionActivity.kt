package com.example.uidemo.transition

import android.graphics.drawable.TransitionDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uidemo.R
import kotlinx.android.synthetic.main.activity_transition.*

class TransitionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition)

        val transitionDrawable = ivTransition.drawable as TransitionDrawable
        transitionDrawable.startTransition(1000)

    }
}
