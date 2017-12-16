package com.androiddev.kotlin_demo.presenter


import android.os.Handler
import android.text.TextUtils

class LoginContractImpl : LoginContractor {


    override fun login(username: String, password: String, listener: LoginContractor.OnLoginFinishedListener) {

        Handler().postDelayed(Runnable {
            var error = false
            if (TextUtils.isEmpty(username)) {
                listener.onUsernameError()
                error = true
                return@Runnable

            }

            if (TextUtils.isEmpty(password)) {
                listener.onPasswordError()
                error = true
                return@Runnable
            }

            if (!error) {
                listener.onSuccess()
            }
        }, 2000)

    }

}
