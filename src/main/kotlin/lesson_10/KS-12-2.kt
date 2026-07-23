package org.example.lesson_10

class WeatherNew(
    var temperatureOfDay: Int,
    var temperatureOfNight: Int,
    var hasPrecipitation: Boolean,
) {
    fun print() {
        val precipitation: String
        if (hasPrecipitation) {
            precipitation = "Ожидаются"
        } else {
            precipitation = "Не ожидаются"
        }
        println("Завтра ожидается температура днем: $temperatureOfDay ночью: $temperatureOfNight Осадки: $precipitation")
    }
}

fun main() {
    val monday = WeatherNew(15, 20, true)
    monday.print()
}