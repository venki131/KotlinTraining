package com.venkatesh.kotlintraining

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ControlFlow(10,20).whenExpression(9)
        Loops().forLoop()
    }

}
