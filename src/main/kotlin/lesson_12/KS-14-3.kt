package org.example.lesson_12

abstract class Figure(
    val color: String,
) {
    abstract fun area(): Double
    abstract fun perimeter(): Double

}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun area(): Double {
        return radius * radius * Math.PI
    }

    override fun perimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }
}

fun main() {

    val listOfFigures = listOf<Figure>(
        Circle("White", 16.5),
        Circle("Black", 13.2),
        Circle("White", 12.4),
        Circle("Black", 9.0),
        Rectangle("Black", 25.0, 16.7),
        Rectangle("White", 19.5, 13.2),
        Rectangle("Black", 15.6, 19.1),
        Rectangle("White", 18.2, 8.1),
    )
    val whiteFigures = listOfFigures.filter { it.color == "White" }
    val blackFigures = listOfFigures.filter { it.color == "Black" }

    val blackFiguresArea = whiteFigures.sumOf { it.perimeter() }
    val whiteFiguresPerimeters = blackFigures.sumOf { it.area() }

    println(whiteFiguresPerimeters)
    println(blackFiguresArea)

}