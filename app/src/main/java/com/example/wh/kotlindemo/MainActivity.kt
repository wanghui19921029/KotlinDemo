package com.example.wh.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {
    val TAG = "whMainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.text = "button"
        btn2.text = "button222222"
        btn.setOnClickListener(this)
        btn2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn -> {
                Log.i(TAG, SingleTon.getA().getS())
                toast("点击了button")
            }
            R.id.btn2 -> {
                Log.i(TAG, SingleTon.getA().getS())
                toast("点击了button222222")
            }
        }
    }
}
