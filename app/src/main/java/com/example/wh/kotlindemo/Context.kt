package com.example.wh.kotlindemo

import android.content.Context
import android.widget.Toast

/**
 * Created by wh on 17-12-22.
 */

fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {//指定了一个参数的值，就不需要在传值了
    Toast.makeText(this, message, duration).show()
}
//调用直接 toast(message);
