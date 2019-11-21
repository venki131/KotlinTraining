package com.venkatesh.kotlintraining

import android.util.Log

/**
 * in Kotlin if is an expression i,e. it returns a value.
 * sample class to showcase the control flow in Kotlin
 */
class ControlFlow(a: Int, b: Int) {
    var a: Int = 0
    var b: Int = 0
    var max: Int = -99

    init {
        this.a = a;
        this.b = b;
    }

    fun traditionalUsage() {
        max = this.a
        if (a < b) max = b
        Log.d("Max number is", "$max")
    }

    fun withElse() {
        if (a > b) {
            max = a
        } else {
            max = b
        }
        Log.d("Max number is ", "$max")
    }

    fun asExpression() {
        val max = if (a > b) a else b
        Log.d("Max number is ", "$max")
    }

    //if branches can be blocks, and the last expression is the value of a block:
    fun asBranch() {
        val max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
    }

    fun whenExpression(x: Int) {
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            3, 4 -> print("x == 3 or x == 4")
            in 5..10 -> print("x is in range between 5 and 10") // range
            is Int -> print("x is an integer number") //check the value is particular type
            else -> {
                print("none of the above")
            }
        }
    }
}

