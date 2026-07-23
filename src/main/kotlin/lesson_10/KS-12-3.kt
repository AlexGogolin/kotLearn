package org.example.lesson_10

class Weather2(
    dayKelvin: Int,
    nightKelvin: Int
) {
    val dayCelsius: Int = dayKelvin - 273
    val nightCelsius: Int = nightKelvin - 273
    fun print() {
        println("Завтра ожидается температура днем: $dayCelsius ночью: $nightCelsius")
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val monday = Weather2(500, 600)
    monday.print()
}