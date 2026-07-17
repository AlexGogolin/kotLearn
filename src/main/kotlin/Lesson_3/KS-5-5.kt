package org.example.Lesson_3

fun main() {
    val secretNumRange = 0..42
    val secretNum1 = secretNumRange.random()
    val secretNum2 = secretNumRange.random()
    val secretNum3 = secretNumRange.random()
    val secretNumList = listOf(secretNum1, secretNum2, secretNum3)

    println("для участия введите 3 числа от 0 до 42!")
    println("Введите 1-е число:")
    val userNum1 = readln().toInt()
    println("Введите 2-е число:")
    val userNum2 = readln().toInt()
    println("Введите 3-е число:")
    val userNum3 = readln().toInt()

    val userNumList = listOf(userNum1, userNum2, userNum3)

    val intersection = secretNumList.intersect(userNumList)
    val intersectionSize = intersection.size

    when {
        intersectionSize == 3 -> {
            println("Вы угадали все числа! Джекпот! Загаданные числа были: $secretNumList")
        }

        intersectionSize == 2 -> {
            println("Вы угадали 2 числа! Приз ждет! Загаданные числа были: $secretNumList")
        }

        intersectionSize == 1 -> {
            println("Вы угадали одно число, получите утешительный приз! Загаданные числа были: $secretNumList")
        }

        else -> {
            println("К сожалению вы проиграли, загаданные числа были: $secretNumList")
        }
    }


}