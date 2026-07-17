package org.example.Lesson_3

fun main() {
    val num1 = 4
    val num2 = 5
    val equation = "$num1 + $num2"
    val sum = num1 + num2

    println("Решите уравнение для доступа: $equation")
    val access = readln().toIntOrNull()

    if (access == null) {
        println("Ошибка: введите целое число. Доступ запрещен")
        return
    } else if (sum == access) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}