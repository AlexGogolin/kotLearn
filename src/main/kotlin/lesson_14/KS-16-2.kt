package org.example.lesson_14

class Circle(
    private val pi: Double = 3.14,
) {

    fun perimeter(radius: Int): Double {
        return (2 * pi) * radius
    }

    fun area(radius: Int): Double {
        return pi * (radius * radius)
    }
}

fun main() {
    val circle = Circle()
    println(circle.perimeter(2))
    println(circle.area(3))
}

