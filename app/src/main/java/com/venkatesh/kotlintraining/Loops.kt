package com.venkatesh.kotlintraining

class Loops {

    fun forLoop() {
        for (item in 1..3)
            print(item) //1 2 3

        for (i in 6 downTo 0 step 2)
            print(i) //6 4 2 0

        val array = arrayOf("a", "b", "c")
        for (i in array.indices) {
            print(i) // a b c
        }

        for ((index, value) in array.withIndex()) {
            print("the element at $index is $value")
        }
    }

    fun whileLoop() {
        var x = 10
        while (x > 0) {
            x--
        }

        do {
            val y = retrieveData()
        } while (y != null)
    }

    private fun retrieveData() {
        // retrieveData
    }

    //An expression in Kotlin may be marked with label
    fun labelExample() {
        loop@ for (i in 1..3) {
            for (j in 1..10) {
                if (j == 2) break@loop
            }

        }
    }

    fun foo() {
        listOf(1, 2, 3, 4, 5).forEach lit@{
            if (it == 3) return@lit
            print(it)
        }
        print(" done with explicit label")
    }
}