package org.example.lesson_8

import kotlin.random.Random

const val USER_LOGIN = "user_login"
const val USER_PASSWORD = "user_password"

fun getToken(login: String, password: String): String? {
    val numbers = "0123456789"
    val chars = "abcdefghijklmnopqrstuvwxyz"
    if (login == USER_LOGIN && password == USER_PASSWORD) {
        val token = buildString {
            for (i in 0..15) {
                append(numbers[Random.nextInt(numbers.length)])
                append(chars[Random.nextInt(chars.length)])
            }
        }.toList().shuffled().joinToString("")
        return token
    } else {
        return null
    }
}

fun getCart(token: String?): List<String>? {
    val card = listOf<String>("Молоко", "Чай", "Сахар", "Кофе", "Пиво")
    if (token != null) {
        return card
    } else {
        return null
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val result = getCart(getToken(USER_LOGIN, USER_PASSWORD))
    if (result != null) {
        println(result.joinToString(" "))
    } else {
        println("Вы не авторизованы!")
    }
}