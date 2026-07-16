package org.example.Lesson_2

fun main() {

    val dayOfTraining: Int = 5
    val isOdd = dayOfTraining % 2 == 1

    println(
        "Упражнения для рук: ${isOdd}\n" +
                "\n" +
                "Упражнения для ног: ${!isOdd}\n" +
                "\n" +
                "Упражнения для спины: ${!isOdd}\n" +
                "\n" +
                "Упражнения для пресса: ${isOdd}"
    )
}