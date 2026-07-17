package org.example.Lesson_4

fun main() {
    val secretNumber = 7
    var turn = 1

    println("Попробуй угадать секретное число от 1 до 9")
    while (turn <= 5) {
        println("Попытка № $turn")
        val answer = readln().toInt()
        if (answer == secretNumber) {
            println("Это была великолепная игра!")
            break
        }
        println("Неверно, осталось попыток ${5 - turn}")
        turn++
    }
    if (turn > 5) {
        println("Было загадано число $secretNumber")
    }
}