package com.example.mvpexplore

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.mvpexplore.modle.User
import com.example.mvpexplore.presenter.IPresenter
import com.example.mvpexplore.presenter.MvpPresenter
import com.example.mvpexplore.view.IView
import com.example.mvpexplore.view.MvpView

import kotlinx.android.synthetic.main.activity_main.*

//第一种继承baseactivity
//class MainActivity : BaseActivity<MvpPresenter>(MvpPresenter::class.java), IView by MvpView() {
//不继承那样写在
class MainActivity : AppCompatActivity(), IView by MvpView() {

    inline fun <reified T : IPresenter> getPresenter(): T {
        return T::class.java.newInstance()

    }
//class MainActivity : AppCompatActivity(),IView by MvpView(),IPresenter by MvpPresenter(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getlayoutID())
        text.setOnClickListener {
            var user = getPresenter<MvpPresenter>().doLogin(this)
            user.observe(this, object : Observer<User> {
                override fun onChanged(t: User?) {

//                    t!!.save()
//                    var list = User().queryAll()
                    Log.e("查看返回值", t.toString())

                }

            })

            showLog()

        }
    }
}
