package com.example.mvpexplore.presenter

import android.content.Context
import com.example.mvpexplore.modle.User

/**
 * Created by IPresenter.
 * User: Administrator
 * Date: 2019/11/7
 * Time: 11:46
 */
interface IPresenter {

    fun doLogin(context: Context): User?
}