package org.example.lesson_5

fun main() {
    println("Сколько секунд хотите засечь?")
    val time = readln().toInt()

    for (sec in time downTo 0 ) {
        println(sec)
        Thread.sleep(1000)
    }
    println("Время вышло!")
}