package org.example.lesson_16

open class Dice(
    val sides: Int = 6,
) {
    fun rollDice() {
        println("${(1..sides).random()}")
    }
}

class SmallDice : Dice(4)
class LargeDice : Dice(8)

fun main() {
    val dice1 = SmallDice()
    val dice2 = Dice()
    val dice3 = LargeDice()

    val diceList: List<Dice> = listOf(dice1, dice2, dice3)
    for (i in diceList) {
        i.rollDice()
    }
}