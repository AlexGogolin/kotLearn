package org.example.lesson_16

open class Screen(val type: String) {
    fun drawCircle(x: Int, y: Int): String {
        return "$type -> с координатами $x $y"
    }

    fun drawCircle(x: Int, y: Float): String {
        return "$type -> с координатами $x $y"
    }

    fun drawCircle(x: Float, y: Int): String {
        return "$type -> с координатами $x $y"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "$type -> с координатами $x $y"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "$type -> с координатами $x $y"
    }

    fun drawSquare(x: Int, y: Float): String {
        return "$type -> с координатами $x $y"
    }

    fun drawSquare(x: Float, y: Int): String {
        return "$type -> с координатами $x $y"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "$type -> с координатами $x $y"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "$type -> с координатами $x $y"
    }

    fun drawPoint(x: Int, y: Float): String {
        return "$type -> с координатами $x $y"
    }

    fun drawPoint(x: Float, y: Int): String {
        return "$type -> с координатами $x $y"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "$type -> с координатами $x $y"
    }
}

class Circle() : Screen("Circle")
class Square() : Screen("Square")
class Point() : Screen("Point")

