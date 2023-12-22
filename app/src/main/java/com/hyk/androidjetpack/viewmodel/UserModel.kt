package com.hyk.androidjetpack.viewmodel

import androidx.databinding.ObservableField

/**
 * 创建日期：2023/12/21 on 15:05
 * 描述:
 * 作者:hyk
 */
data class UserModel (
    val username: ObservableField<String> = ObservableField(""),
    val password: ObservableField<String> = ObservableField("")
) {
    override fun toString(): String {
        return "UserModel(username=$username, password=$password)"
    }
}
