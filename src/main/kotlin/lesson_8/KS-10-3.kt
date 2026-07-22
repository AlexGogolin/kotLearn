package org.example.lesson_8

import kotlin.random.Random

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val symbols: String = "!\"#\$%&'()*+,-./ "
    val numbers: String = "0123456789"

    println("Какой длины пароль вы бы хотели?")
    val passwordLength = readln().toInt()

    fun passwordGenerator(length: Int): String {
        var password: String = ""
        for (i in 1..length) {
            if (i % 2 == 0) {
                password += symbols[Random.nextInt(symbols.length)]
            } else {
                password += numbers[Random.nextInt(numbers.length)]
            }
        }
        return password
    }
    println(passwordGenerator(passwordLength))
}