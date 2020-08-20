package com.prinzlycoder.warpeopleandroidtrainingsession1.week6

import org.junit.Test

class Week6Test {
    private val myIntArray = Array(5){0}
    private val myStringArray = Array(10){""}
    private val anotherIntArray = intArrayOf(1,2,3,4,5)

    @Test
    fun main() {
        println(anotherIntArray.size)
        println(myIntArray.size)
        println(myStringArray.size)
    }

    @Test
    fun `For loop example 1`(){
        val size = anotherIntArray.size
        for (i in 0..10){
            println(i)
        }
    }

    @Test
    fun `For loop example 2`(){
        for (i in 0 until 10){
            println(i)
        }
    }

    @Test
    fun `For loop example 3`(){
        for (i in 9 downTo 0){
            println(i)
        }
    }

    @Test
    fun `For loop example 4`(){
        val lastIndex = anotherIntArray.lastIndex
        for (i in lastIndex downTo 0){
            println(anotherIntArray[i])
        }
    }

    @Test
    fun `While Loop example 1`(){
        var counter = 0
        while(counter <= anotherIntArray.lastIndex){
            println(counter)
            counter ++
        }
    }


    @Test
    fun `If else condition 1`(){
        //Enter to the movie theater if you are older than 13
        val age = 13
        if(age > 13){
            println("You can enter")
        }
        else{
            println("You cannot enter")
        }
    }

    @Test
    fun `If else condition 2`(){
        //Enter to the movie theater if you are older than 13
        val age = 15
        if(age > 13){
            println("You can enter")
        }
        else{
            println("You cannot enter")
        }
    }
}

