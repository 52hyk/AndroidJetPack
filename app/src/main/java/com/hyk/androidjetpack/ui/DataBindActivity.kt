package com.hyk.androidjetpack.ui


import android.util.Log
import android.widget.TextView
import com.hyk.androidjetpack.R
import com.hyk.androidjetpack.base.activity.BaseActivity
import com.hyk.androidjetpack.databinding.LayoutLoginDataBindBinding

import com.hyk.androidjetpack.viewmodel.UserModel

/**
 * 创建日期：2023/12/21 on 16:57
 * 描述:
 * 作者:hyk
 */
class DataBindActivity : BaseActivity<LayoutLoginDataBindBinding>() {
    private val mUserModel: UserModel by lazy { UserModel() }
    override fun getLayoutId(): Int {
        return R.layout.layout_login_data_bind
    }

    override fun initData() {
        mDataBind.userModel = mUserModel

    }

    override fun initView() {
        findViewById<TextView>(R.id.loginBtn).setOnClickListener {
            login()
        }
    }

    private fun login() {
        val username = mUserModel.username.get().toString()
        val password: String = mUserModel.password.get().toString()
        Log.d("mUserModel", "username:$username  password:$password")
    }
}