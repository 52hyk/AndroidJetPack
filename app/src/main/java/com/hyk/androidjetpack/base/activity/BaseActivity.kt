package com.hyk.androidjetpack.base.activity

/**
 * 创建日期：2023/12/21 on 17:10
 * 描述:
 * 作者:hyk
 */

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<DB : ViewDataBinding> : AppCompatActivity() {
    lateinit var mDataBind: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBind = DataBindingUtil.setContentView<DB>(this, getLayoutId())
        initData()
        initView()
    }

    abstract fun getLayoutId(): Int

    override fun onDestroy() {
        super.onDestroy()
        mDataBind.unbind()
    }

    abstract fun initData()
    abstract fun initView()
}