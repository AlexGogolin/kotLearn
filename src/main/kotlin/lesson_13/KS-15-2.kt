package org.example.lesson_13

abstract class WeatherStationStats(
    val amount: Int
) {
    abstract fun getInfo(): String
}

class Temperature(
    val temperature: Int,
) : WeatherStationStats(temperature) {
    override fun getInfo(): String = "Температура составляет $temperature°C"
}

class PrecipitationAmount(
    val precipitationAmount: Int,
) : WeatherStationStats(precipitationAmount) {
    override fun getInfo(): String = "Количество осадков составляет $precipitationAmount мм"
}

class WeatherServer() {
    fun sendInfo(stats: WeatherStationStats) {
        println(stats.getInfo())
    }
}

fun main() {
    val temperature = Temperature(28)
    val precipitation = PrecipitationAmount(28)
    val weatherServer = WeatherServer()
    weatherServer.sendInfo(temperature)
    weatherServer.sendInfo(precipitation)
}