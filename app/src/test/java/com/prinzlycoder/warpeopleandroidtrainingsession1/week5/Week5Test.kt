package com.prinzlycoder.warpeopleandroidtrainingsession1.week5

import com.prinzlycoder.warpeopleandroidtrainingsession1.Dice
import org.junit.Test

class Week5Test {


    /**
     *
     * val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} sided dice rolled ${diceRoll}!")

    myFirstDice.sides = 20
    println("Your ${myFirstDice.sides} sided dice rolled ${myFirstDice.roll()}!")
     */

    @Test
    fun testDisplayingDice(){
        val dice = Dice()
        val diceRoll =  dice.roll()
        println("Your dice is showing the value $diceRoll")
    }
}