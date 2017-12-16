package com.androiddev.kotlin_demo.presenter


import com.androiddev.kotlin_demo.view.LoginView

class LoginPresenterImpl(private var loginView: LoginView?) : LoginPresenter, LoginContractor.OnLoginFinishedListener {
    private val loginContract: LoginContractor

    init {
        this.loginContract = LoginContractImpl()

    }

    override fun validateCredentials(username: String, password: String) {

        if (loginView != null) {
            loginView!!.showProgress()
        }
        loginContract.login(username, password, this)
    }

    override fun onDestroy() {
        loginView = null
    }

    override fun onUsernameError() {
        if (loginView != null) {
            loginView!!.setUsernameError()
            loginView!!.hideProgress()
        }

    }

    override fun onPasswordError() {
        if (loginView != null) {
            loginView!!.setUserPwdError()
            loginView!!.hideProgress()
        }

    }

    override fun onSuccess() {
        if (loginView != null) {
            loginView!!.navigateToHome()
        }
    }
}
