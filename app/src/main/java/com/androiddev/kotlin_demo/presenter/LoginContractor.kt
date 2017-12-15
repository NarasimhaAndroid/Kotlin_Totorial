package com.androiddev.kotlin_demo.presenter


interface LoginContractor {

    interface OnLoginFinishedListener {

        fun onUsernameError()

        fun onPasswordError()

        fun onSuccess()
    }

    fun login(username: String, password: String, listener: OnLoginFinishedListener)
}

