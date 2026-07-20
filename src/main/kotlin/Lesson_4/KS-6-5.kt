package org.example.Lesson_4

fun main() {

    var attempt = 0
    while (true) {
        attempt++
        val secretNum1: Int = (1..9).random()
        val secretNum2: Int = (1..9).random()
        println("Для авторизации докажите что вы не бот и решите пример: $secretNum1 + $secretNum2 = ?")
        val answer = readln().toInt()
        if (answer == secretNum1 + secretNum2) {
            println("Добро пожаловать!")
            break
        } else if (attempt == 3) {
            println("Доступ запрещен")
            break
        }

    }
}