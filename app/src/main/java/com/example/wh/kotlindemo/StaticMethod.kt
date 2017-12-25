package com.example.wh.kotlindemo

/**
 * Created by wanghui on 2017/12/23.
 */
object StaticMethod {//object表示可以静态调用

    fun getNull(): String {
        MainActivity().TAG
        return "result--->Null"
    }
}