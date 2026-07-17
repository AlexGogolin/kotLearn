package org.example.Lesson_3

fun main() {

    val num1 = 15
    val num2 = 34
    println("Введите число от 0 до 42")

    println("Введите первое число")
    val userNum1 = readln().toIntOrNull()

    println("Введите второе число")
    val userNum2 = readln().toIntOrNull()

    val firstMatch = num1 == userNum1 || num1 == userNum2
    val secondMatch = num2 == userNum1 || num2 == userNum2

    val matchCount = (if (firstMatch) 1 else 0) + (if (secondMatch) 1 else 0)

    if (matchCount == 2) {
        println("Поздравляем! Вы выиграли главный приз! Выигрышные числа: $num1 и $num2")
    }else if (matchCount == 1){
        println("Вы выиграли утешительный приз! Выигрышные числа: $num1 и $num2")
    }else println("Неудача! Выигрышные числа были: $num1 и $num2")
}