package com.prinzlycoder.warpeopleandroidtrainingsession1

class Dice {
    var sides = 6

    fun roll(): Int {
        return (1..sides).random()
    }
}