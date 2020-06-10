package com.example.mvpexplore.presenter

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.mvpexplore.modle.User

/**
 * Created by MvpPresenter.
 * User: Administrator
 * Date: 2019/11/7
 * Time: 11:51
 * 具体实现的
 */
class MvpPresenter : IPresenter {
    override fun doLogin(context: Context): MutableLiveData<User> {
        val result: MutableLiveData<User> =
            MutableLiveData<User>()
        Toast.makeText(context, "吐司了", Toast.LENGTH_SHORT).show()
        var user = User(1, "小明同学")
        result.postValue(user)
        return result
    }

}