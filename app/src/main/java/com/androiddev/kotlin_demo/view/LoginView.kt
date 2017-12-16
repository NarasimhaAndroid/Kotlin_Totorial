package com.androiddev.kotlin_demo.view


interface LoginView {

    fun showProgress()
    fun hideProgress()
    fun setUsernameError()
    fun setUserPwdError()
    fun navigateToHome()

}