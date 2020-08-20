package com.prinzlycoder.warpeopleandroidtrainingsession1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        checkButton.setOnClickListener {
            displayResult()
        }
    }

    private fun displayResult() {
        val input = ageInput.text.toString()
        if (input.isEmpty()) {
            val age = input.toInt()
            if (age > 13) {
                verdict.text = "You can enter"
            } else {
                verdict.text = "You cannot enter"
            }
        }
    }
}