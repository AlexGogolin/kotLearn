package org.example.lesson_16

open class Dice(
    val sides: Int = 6,
) {
    fun rollDice() {
        val result = (1..sides).random()
        println(result)
    }
}

class SmallDice(
    sides: Int = 4,
) : Dice(sides)

class LargeDice(
    sides: Int = 8,
) : Dice(sides)

fun main() {
    val dice1 = SmallDice()
    val dice2 = Dice()
    val dice3 = LargeDice()

    val diceList: List<Dice> = listOf(dice1, dice2, dice3)
    for (i in diceList) {
        i.rollDice()
    }
}