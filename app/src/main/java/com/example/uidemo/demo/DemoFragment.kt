package com.example.uidemo.demo

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uidemo.R

class DemoFragment : Fragment() {

    companion object {
        fun newInstance(): DemoFragment = DemoFragment()
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("zavanton", "zavanton - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("zavanton", "zavanton - onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("zavanton", "zavanton - onCreateView")
        return inflater.inflate(R.layout.fmt_demo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("zavanton", "zavanton - onViewCreated")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("zavanton", "zavanton - onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("zavanton", "zavanton - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("zavanton", "zavanton - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("zavanton", "zavanton - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("zavanton", "zavanton - onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("zavanton", "zavanton - onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("zavanton", "zavanton - onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("zavanton", "zavanton - onDetach")
    }
}