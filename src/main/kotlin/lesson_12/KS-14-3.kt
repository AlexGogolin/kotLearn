package org.example.lesson_12

const val WHITE ="White"
const val BLACK = "Black"

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
        Circle(WHITE, 16.5),
        Circle(BLACK, 13.2),
        Circle(WHITE, 12.4),
        Circle(BLACK, 9.0),
        Rectangle(BLACK, 25.0, 16.7),
        Rectangle(WHITE, 19.5, 13.2),
        Rectangle(BLACK, 15.6, 19.1),
        Rectangle(WHITE, 18.2, 8.1),
    )
    val whiteFigures = listOfFigures.filter { it.color == WHITE }
    val blackFigures = listOfFigures.filter { it.color == BLACK }

    val blackFiguresPerimeter = blackFigures.sumOf { it.perimeter() }
    val whiteFiguresArea = whiteFigures.sumOf { it.area() }
    println(blackFiguresPerimeter)
    println(whiteFiguresArea)


}