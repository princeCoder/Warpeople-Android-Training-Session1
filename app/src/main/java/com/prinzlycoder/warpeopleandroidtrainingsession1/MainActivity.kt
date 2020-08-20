package com.prinzlycoder.warpeopleandroidtrainingsession1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollBtn.setOnClickListener { rollDice() }
        nextBtn.setOnClickListener { startSecondActivity() }
    }

    private fun rollDice() {
        val dice = Dice()
        val diceValue = dice.roll()
        diceText.text = diceValue.toString()
    }

    private fun startSecondActivity() {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}
