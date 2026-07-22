package org.example.lesson_8

fun rollDice(): Int {
    val roll = (1..6).random()
    return roll
}

fun rollGame(): Boolean {
    val humanRoll = rollDice()
    val computerRoll = rollDice()
    if (humanRoll == computerRoll) {
        println("Ничья, счет: $humanRoll : $computerRoll")
    } else if (humanRoll > computerRoll) {
        println("Победил человек, счет: $humanRoll : $computerRoll")
    } else {
        println("Победила машина, счет: $humanRoll : $computerRoll")
    }
    return humanRoll > computerRoll
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    var humanScore = 0
    while (true) {
        if (rollGame() == true) {
            humanScore++
        }
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val userAnswer = readln()
        if (userAnswer != "Да") {
            println("Человек выиграл $humanScore раз")
            break
        }
    }
}