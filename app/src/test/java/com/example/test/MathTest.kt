package com.example.test

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MathTest {

    private var math: Math? = null

    @Before
    fun init() {
        math = Math()
    }

    @Test
    fun simpleAddTest(){
        assertEquals("5",math?.add("3","2"))
    }
    @Test
    fun doubleAddTest(){
        assertEquals("5.0",math?.add("2.5","2.5"))
    }
    @Test
    fun symbolAddTest(){
        assertEquals("Нужно вводить только числа",math?.add("$","2"))
    }

    @Test
    fun simpleDivide(){
        assertEquals("3",math?.divide("6","2"))
    }
    @Test
    fun divideOnZero(){
        assertEquals("На ноль делить нельзя",math?.divide("6","0"))
    }
    @Test
    fun symbolDivideTest(){
        assertEquals("Нужно вводить только числа",math?.divide("$","2"))
    }

    @After
    fun detach() {
        math = null

    }
}