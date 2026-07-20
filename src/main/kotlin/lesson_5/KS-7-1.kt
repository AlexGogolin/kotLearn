package org.example.lesson_5

import kotlin.random.Random


fun main() {
    val upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val lowerChars = "abcdefghijklmnopqrstuvwxyz"

    var password = ""

    for (i in 1..3) {
        password += upperChars[Random.nextInt(upperChars.length)]
        password += lowerChars[Random.nextInt(lowerChars.length)]
    }

    println(password)

}