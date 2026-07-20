package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val numbers = listOf<String>("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")
    val lowerChars = listOf<String>(
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "z"
    )
    val upperChars = listOf<String>(
        "A",
        "B",
        "C",
        "D",
        "E",
        "F",
        "G",
        "H",
        "I",
        "J",
        "K",
        "L",
        "M",
        "N",
        "O",
        "P",
        "Q",
        "R",
        "S",
        "T",
        "U",
        "V",
        "W",
        "X",
        "Y",
        "Z"
    )

    println("Введите длину пароля которую хотите не менее 6 символов:")
    var passwordLength: Int = readln().toInt()
    while (passwordLength < 6) {
        println("Пароль должен быть не менее 6 символов")
        passwordLength = readln().toInt()
    }
    val charStorage = mutableListOf<String>()

    for (char in 1..passwordLength) {
        charStorage += numbers[(Random.nextInt(numbers.size))]
        charStorage += lowerChars[(Random.nextInt(lowerChars.size))]
        charStorage += upperChars[(Random.nextInt(upperChars.size))]
    }

    val passwordGenerator = mutableListOf<String>()
        passwordGenerator += numbers[(Random.nextInt(numbers.size))]
        passwordGenerator += lowerChars[(Random.nextInt(lowerChars.size))]
        passwordGenerator += upperChars[(Random.nextInt(upperChars.size))]
        passwordGenerator += charStorage.shuffled().take(passwordLength - 3)
        passwordGenerator.shuffle()
    val password: String = passwordGenerator.joinToString(separator = "")

    println(password)
}