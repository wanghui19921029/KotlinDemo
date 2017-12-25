package com.example.wh.kotlindemo

import android.util.Log

/**
 * Created by wanghui on 2017/12/24.
 */
class SingleTon private constructor() {
    companion object {
        val TAG = "whMainActivity"
        var singleTon: SingleTon? = null
        fun getA(): SingleTon {
            if (singleTon == null) {
                synchronized(javaClass) {
                    if (singleTon == null) {
                        singleTon = SingleTon()
                        Log.i(TAG, "singleTon = SingleTon()")
                    }
                }
            }
            return singleTon as SingleTon
        }
    }

    fun getS(): String {
        Log.i(TAG, "getS()")
        return "ssssss"
    }
}