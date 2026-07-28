package org.example.lesson_14

private const val PI: Double = 3.14

class Circle(
    private val radius: Int,
) {

    fun perimeter(): Double {
        return (2 * PI) * radius
    }

    fun area(): Double {
        return PI * (radius * radius)
    }
}

fun main() {
    val circle = Circle(5)
    println(circle.perimeter())
    println(circle.area())
}

