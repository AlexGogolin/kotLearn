package org.example.lesson_10

import kotlin.random.Random

class Weather5(
    var temperatureOfDay: Int,
    var temperatureOfNight: Int,
    var humidity: Boolean,
)

fun main() {
    val days = mutableListOf<Weather5>()
    for (i in 1..30) {
        val dayTemperature: Int = (-20..45).random()
        val nightTemperature: Int = (-30..30).random()
        val hasHumidity = Random.nextBoolean()
        days.add(Weather5(dayTemperature, nightTemperature, hasHumidity))
    }
    val nightTemperatures = days.map { it.temperatureOfNight }
    val dayTemperatures = days.map { it.temperatureOfDay }
    val avgDay = dayTemperatures.average()
    val avgNight = nightTemperatures.average()
    val dayOfHumidity = days.count { it.humidity }

    println("Среднее значение дневной температуры: $avgDay")
    println("Среднее значение ночной температуры: $avgNight")
    println("Дней с осадками: $dayOfHumidity")
}