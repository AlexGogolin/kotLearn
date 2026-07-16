package org.example.Lesson_3

import java.time.LocalDate

const val ADULT_AGE = 18

fun main() {
    println("Введите возраст:")
    val userBornYear = readln().toIntOrNull()
    val currentDate = LocalDate.now()
    val currentYear = currentDate.year
    val isOldEnough = userBornYear != null && currentYear - userBornYear >= ADULT_AGE

    if (isOldEnough) println("Показать экран со скрытым контентом")
    else println("Ваш возраст недостаточен или вы ввели некорректные данные")
}