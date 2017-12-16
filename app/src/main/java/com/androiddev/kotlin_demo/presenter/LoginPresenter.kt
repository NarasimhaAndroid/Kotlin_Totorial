package com.androiddev.kotlin_demo.presenter


interface LoginPresenter {

    fun validateCredentials(username: String, password: String)

    fun onDestroy()
}
