package org.example.lesson_5

import kotlin.random.Random

fun main() {

    var password: Int = Random.nextInt(1000, 10000)

    println("Ваш код авторизации: $password")
    println("Введите код авторизации")
    var userAnswer = readln().toInt()
    while (userAnswer != password) {
        password = Random.nextInt(1000, 10000)
        println("Неверно, ваш код авторизации $password")
        println("Попробуйте еще раз")
        userAnswer = readln().toInt()
    }

    println("Вы авторизовались!!")
}