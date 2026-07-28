package org.example.lesson_14

class Dice(
    private val rollResult: Int = (1..6).random()
) {
    fun roll() {
        println(rollResult)
    }
}

fun main() {
    val dice = Dice()
    dice.roll()
}