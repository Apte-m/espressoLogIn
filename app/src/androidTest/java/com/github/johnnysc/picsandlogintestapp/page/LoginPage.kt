package com.github.johnnysc.picsandlogintestapp.page

import com.github.johnnysc.picsandlogintestapp.R


class LoginPage : BasePage {

    constructor(action: LoginPage.() -> Unit) {
        this.action()
    }

    constructor()

    companion object {
        const val navigationLogin = R.id.navigation_login
        const val viewLogin = R.id.logoImageView
        const val loginButton = R.id.loginButton
        const val textLoginError = R.id.emailAddressTextInputLayout
        const val textPasswordError = R.id.passwordTextInputLayout
        const val inputTextLogin = R.id.emailAddressEditText
        const val emailAddress = R.id.emailAddressTextInputLayout
    }


}


