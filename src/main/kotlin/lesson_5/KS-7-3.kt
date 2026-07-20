package org.example.lesson_5

fun main() {
    println("Введите число:")
    val userNumber = readln().toInt()

    for (num in 0..userNumber step 2){
        println(num)
    }

}