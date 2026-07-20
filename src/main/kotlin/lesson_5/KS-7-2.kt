package org.example.lesson_5

import kotlin.random.Random

fun main() {

    var password = ""
    val numbers = "0123456789"
    for (i in 1..4) {
        password += numbers[(Random.nextInt(numbers.length))]

    }
    println("Ваш код авторизации: $password")
    println("Введите код авторизации")
    var userAnswer = readln()
    while (userAnswer != password) {
        println("Неверно, ваш код авторизации $password")
        println("Попробуйте еще раз")
        userAnswer = readln()
    }

    println("Вы авторизовались!!")
}