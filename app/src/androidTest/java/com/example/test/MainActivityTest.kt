package com.example.test

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @Rule
    @JvmField
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun add() {
        Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("4"))
        Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.typeText("5"))
        Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.equalsBtn)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.resultTv)).check(ViewAssertions.matches(withText("9")))
    }


    @Test
    fun divide() {
        Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.typeText("6"))
        Espresso.onView(withId(R.id.firstEd)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.typeText("2"))
        Espresso.onView(withId(R.id.secondEd)).perform(ViewActions.closeSoftKeyboard())
        Espresso.onView(withId(R.id.divideBtn)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.resultTv)).check(ViewAssertions.matches(withText("3")))
    }
}