package org.example.Lesson_4

const val QUANTITY_OF_ATTEMPTS = 5

fun main() {
    val secretNumber = (1..9).random()
    var turn = 1

    println("Попробуй угадать секретное число от 1 до 9")
    while (turn <= QUANTITY_OF_ATTEMPTS) {
        println("Попытка № $turn")
        val answer = readln().toInt()
        if (answer == secretNumber) {
            println("Это была великолепная игра!")
            break
        }
        println("Неверно, осталось попыток ${QUANTITY_OF_ATTEMPTS - turn}")
        turn++
    }
    if (turn > QUANTITY_OF_ATTEMPTS) {
        println("Было загадано число $secretNumber")
    }
}