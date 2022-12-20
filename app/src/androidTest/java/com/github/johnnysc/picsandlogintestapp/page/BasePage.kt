package com.github.johnnysc.picsandlogintestapp.page


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.github.johnnysc.picsandlogintestapp.HasTextInputLayoutErrorMatcher
import com.github.johnnysc.picsandlogintestapp.TextInputLayoutHasNoError


interface BasePage {
    /**
    клик по елементу
     */
    fun clickElement(value: Int): BasePage {
        onView(withId(value)).perform(ViewActions.click())
        return this
    }

    /**
    проверка отображения
     */
    fun checkIsDisplayed(value: Int): BasePage {
        onView(withId(value))
            .check(matches(ViewMatchers.isDisplayed()))
        return this

    }

    /**
    проверка строки с ошидкой
     */
    fun hasTextInputLayoutErrorMatcher(value: Int, text: String): BasePage {
        onView(withId(value))
            .check(matches(HasTextInputLayoutErrorMatcher(text)))
        return this
    }

    /**
    отсустсвие ошибки
     */
    fun textInputLayoutHasNoError(value: Int): BasePage {
        onView(withId(value)).check(matches(TextInputLayoutHasNoError()))
        return this
    }

    /**
    ввести  текст
     */

    fun inputTextToForm(value: Int, text: String): BasePage {
        onView(withId(value)).perform(typeText(text), closeSoftKeyboard())
        return this
    }


}