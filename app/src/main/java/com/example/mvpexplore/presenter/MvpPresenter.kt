package com.example.mvpexplore.presenter

import android.content.Context
import android.widget.Toast
import com.example.mvpexplore.modle.User

/**
 * Created by MvpPresenter.
 * User: Administrator
 * Date: 2019/11/7
 * Time: 11:51
 * 具体实现的
 */
class MvpPresenter : IPresenter {
    override fun doLogin(context: Context): User? {
        Toast.makeText(context, "吐司了", Toast.LENGTH_SHORT).show()
        return null
    }

}