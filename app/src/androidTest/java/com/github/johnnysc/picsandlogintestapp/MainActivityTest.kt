package com.github.johnnysc.picsandlogintestapp

import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.github.johnnysc.picsandlogintestapp.page.LoginPage
import com.github.johnnysc.picsandlogintestapp.page.LoginPage.Companion.emailAddress
import com.github.johnnysc.picsandlogintestapp.page.LoginPage.Companion.inputTextLogin
import com.github.johnnysc.picsandlogintestapp.page.LoginPage.Companion.loginButton
import com.github.johnnysc.picsandlogintestapp.page.LoginPage.Companion.navigationLogin
import com.github.johnnysc.picsandlogintestapp.page.LoginPage.Companion.textLoginError
import com.github.johnnysc.picsandlogintestapp.page.LoginPage.Companion.textPasswordError
import com.github.johnnysc.picsandlogintestapp.page.LoginPage.Companion.viewLogin
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun checkInputText() {
        LoginPage()
            .clickElement(navigationLogin)
            .checkIsDisplayed(viewLogin)
            .clickElement(loginButton)
            .hasTextInputLayoutErrorMatcher(textLoginError, "Input is empty")
            .hasTextInputLayoutErrorMatcher(textPasswordError, "Input is empty")

    }

    @Test
    fun checkNoErrorText() {
        LoginPage()
            .clickElement(navigationLogin)
            .inputTextToForm(inputTextLogin, "j")
            .textInputLayoutHasNoError(emailAddress)
    }

    @Test
    fun checkPasswordAndEmail() {

    }


//        onView(withId(R.id.loginButton)).perform(click())
//        onView(withId(R.id.emailAddressTextInputLayout)).check(matches(HasTextInputLayoutErrorMatcher("Email is incorrect")))
//
//        onView(withId(R.id.emailAddressEditText)).perform(
//            replaceText("johnnysc091@gmail.com"),
//            closeSoftKeyboard()
//        )
//        onView(withId(R.id.emailAddressTextInputLayout)).check(
//            matches(
//                TextInputLayoutHasNoError()
//            )
//        )
//
//        onView(withId(R.id.passwordEditText)).perform(replaceText("12345"), closeSoftKeyboard())
//        onView(withId(R.id.loginButton)).perform(click())
//        onView(withId(R.id.passwordTextInputLayout)).check(matches(HasTextInputLayoutErrorMatcher("Input should be at least 6 signs long")))
//
//        listOf("123456", "asdfgh", "ASDFGH", "!@#$%^&").forEach {
//            onView(withId(R.id.passwordEditText)).perform(replaceText(it), closeSoftKeyboard())
//            onView(withId(R.id.loginButton)).perform(click())
//            onView(withId(R.id.passwordTextInputLayout)).check(matches(HasTextInputLayoutErrorMatcher("Password should contain at least 1 lowercase letter, 1 uppercase letter and 1 digit")))
//        }
//
//        onView(withId(R.id.passwordEditText)).perform(
//            replaceText("asdfASDF123"),
//            closeSoftKeyboard()
//        )
//        onView(withId(R.id.loginButton)).perform(click())
//        onView(withId(R.id.passwordTextInputLayout)).check(matches(TextInputLayoutHasNoError()))
//
//        onView(withId(com.google.android.material.R.id.snackbar_text))
//            .check(matches(withText("stub with args")))
//    }

}