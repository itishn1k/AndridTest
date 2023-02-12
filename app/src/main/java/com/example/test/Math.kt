package com.example.test

class Math {
    fun add(a: String, b: String): String {
        val result: String = if (a.contains(".") || b.contains(".")) {
            (a.toDouble() + b.toDouble()).toString()
        } else if (!isInteger(a) || !isInteger(b)) {
            "Нужно вводить только числа"
        } else {
            (a.toInt() + b.toInt()).toString()
        }
        return result
    }

    fun divide(a: String, b: String): String {
        val result: String = if (b == "0" || b == "0.0") {
            "На ноль делить нельзя"
        } else if (!isDouble(a) || !isDouble(b)) {
            "Нужно вводить только числа"
        } else if (a.contains(".") || b.contains(".")) {
            (a.toDouble() / b.toDouble()).toString()
        } else {
            (a.toInt() / b.toInt()).toString()
        }
        return result
    }

    private fun isInteger(str: String?) = str?.toIntOrNull()?.let { true } ?: false
    private fun isDouble(str: String?) = str?.toDoubleOrNull()?.let { true } ?: false
}