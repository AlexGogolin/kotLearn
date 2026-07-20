package org.example.lesson_5

import kotlin.random.Random


fun main() {
    val numbers = "123456789"
    val lowerChars = "abcdefghijklmnopqrstuvwxyz"

    var password = ""

    for (i in 1..3) {
        password += lowerChars[Random.nextInt(lowerChars.length)]
        password += numbers[Random.nextInt(numbers.length)]
    }

    println(password)

}