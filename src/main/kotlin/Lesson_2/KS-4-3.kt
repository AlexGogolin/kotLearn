package org.example.Lesson_2

const val NORMAL_HUMIDITY = 20

fun main() {
    val isSunWeather: Boolean = true
    val isOpenTent: Boolean = true
    val airHumidity: Int = 20
    val timeOfTheYear: String = "Зима"

    val isFavorable: Boolean = isSunWeather && isOpenTent && airHumidity == NORMAL_HUMIDITY && timeOfTheYear != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorable")
}