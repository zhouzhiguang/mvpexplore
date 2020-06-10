package com.example.mvpexplore.view

import android.util.Log
import com.example.mvpexplore.MainActivity
import com.example.mvpexplore.R

/**
 * Created by MvpView.
 * User: Administrator
 * Date: 2019/11/7
 * Time: 11:50
 */
class MvpView() : IView {


    override fun showLog() {
        Log.e("你妹妹的", "另外的一种mvp")
    }

    override fun getlayoutID(): Int {
        return R.layout.activity_main
    }
}