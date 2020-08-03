package com.prinzlycoder.warpeopleandroidtrainingsession1.week4

import org.junit.Test

class Labs {

    /**
     * Write a Kotlin function that prints: “I am taking Android App development course”
     */
    private fun displaySentence() {
        println("I am taking Android App development course")
    }

    /**
     * Create a function that takes no parameter and displays your name
     */
    private fun displayMyName() {
        println("Prinzly Ngassa")
    }

    /**
     * Create a function that takes two integers and displays their sum.
     */
    private fun sum(a: Int, b: Int) {
        println("${a + b}")
    }

    /**
     * Create a function that takes an integer n and returns n times 10
     */
    private fun multiplyByTen(n: Int): Int {
        return n * 10
    }

    @Test
    fun main() {
        //Lab 1
        displaySentence()

        //Lab 2
        displayMyName()

        //Lab 3
        sum(5, 4)

        //Lab 4
        multiplyByTen(5)

        //Lab 5
        val programmer = Programmer("Prinzly Ngassa", 8)
        println(programmer.getName())
        println(programmer.getExperience())

        //Lab 6
        val myInterface = MyInterfaceImpl()
        println(myInterface.display())
    }

}

class Programmer(private val name: String, private val yearOfExperience: Int) {
    fun getName(): String {
        return name
    }

    fun getExperience(): Int {
        return yearOfExperience
    }
}

class MyInterfaceImpl: MyInterface{
    override fun display() {
        println("This makes me happy")
    }
}

interface MyInterface{
    fun display()
}

