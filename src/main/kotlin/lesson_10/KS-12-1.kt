package org.example.lesson_10

class Weather{
    var temperatureOfDay: Int = 0
    var temperatureOfNight: Int = 0
    var hasPrecipitation: Boolean = false

    fun print(){
        var precipitation: String
        if (hasPrecipitation){
            precipitation = "Ожидаются"
        }else{
            precipitation = "Не ожидаются"
        }
        println("Завтра ожидается температура днем: $temperatureOfDay ночью: $temperatureOfNight Осадки: $precipitation")
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val monday = Weather()
    val friday = Weather()
    monday.temperatureOfNight = 15
    monday.temperatureOfDay = 25
    monday.hasPrecipitation = true
    friday.temperatureOfNight = 20
    friday.temperatureOfDay = 30
    monday.print()
    friday.print()
}