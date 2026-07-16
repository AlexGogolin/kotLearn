package org.example.Lesson_2

fun main() {

    val hasDamage: Boolean = readln().toBoolean()
    val crew: Int = readln().toInt()
    val food: Int = readln().toInt()
    val goodWeather: Boolean = readln().toBoolean()


    val hasEnoughCrew = crew in 55..70
    val maxCrew = 70
    val hasFood = food > 50
    val enoughFood = food >=50

    val canSwim: Boolean = (!hasDamage && hasEnoughCrew && hasFood) || (crew == maxCrew && goodWeather && enoughFood)

    println(canSwim)
}