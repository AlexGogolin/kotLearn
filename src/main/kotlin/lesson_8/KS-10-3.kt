package org.example.lesson_8

import kotlin.random.Random

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val symbols: String = "!\"#\$%&'()*+,-./ "
    val numbers: String = "0123456789"
    var password = ""

    println("Какой длины пароль вы бы хотели?")
    val passwordLength = readln().toInt()

    fun passwordGenerator(length: Int): String{
        for (i in 1 .. length / 2){
            password += symbols[Random.nextInt(symbols.length)]
            password += numbers[Random.nextInt(numbers.length)]
        }
        return password
    }
    println(passwordGenerator(passwordLength))
}