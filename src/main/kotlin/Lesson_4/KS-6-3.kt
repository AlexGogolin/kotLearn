package org.example.Lesson_4

fun main() {
    println("Сколько секунд вы хотели бы засечь?")
    var seconds = readln().toIntOrNull()

    if (seconds != null) {
        while (seconds > 0) {
            println("Осталось секунд: $seconds")
            Thread.sleep(1000)
            seconds--
        }
    }
    println("Время вышло")
}