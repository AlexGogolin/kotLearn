package org.example.lesson_10

class Weather3(
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
    init {
        print()
    }
}

fun main() {
    val monday = Weather3(15, 24, true)
}