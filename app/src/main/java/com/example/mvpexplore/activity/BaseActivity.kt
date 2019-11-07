package com.example.mvpexplore.activity

import androidx.appcompat.app.AppCompatActivity

/**
 * Created by BaseActivity.
 * User: Administrator
 * Date: 2019/11/7
 * Time: 12:14
 */
open class BaseActivity<T>(var clazz: Class<T>) : AppCompatActivity() {
    val presenter by lazy { clazz.newInstance() }

    companion object {
        inline operator fun <reified T> invoke() = BaseActivity<T>(T::class.java)
    }

}