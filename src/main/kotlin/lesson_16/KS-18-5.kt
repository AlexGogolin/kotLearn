package org.example.lesson_16

open class Screen{
    fun drawCircle(x: Int, y: Int): String {
        return "Круг -> с координатами $x $y"
    }

    fun drawCircle(x: Int, y: Float): String {
        return "Круг -> с координатами $x $y"
    }

    fun drawCircle(x: Float, y: Int): String {
        return "Круг -> с координатами $x $y"
    }

    fun drawCircle(x: Float, y: Float): String {
        return "Круг -> с координатами $x $y"
    }

    fun drawSquare(x: Int, y: Int): String {
        return "Квадрат -> с координатами $x $y"
    }

    fun drawSquare(x: Int, y: Float): String {
        return "Квадратe -> с координатами $x $y"
    }

    fun drawSquare(x: Float, y: Int): String {
        return "Квадрат -> с координатами $x $y"
    }

    fun drawSquare(x: Float, y: Float): String {
        return "Квадрат -> с координатами $x $y"
    }

    fun drawPoint(x: Int, y: Int): String {
        return "Точка -> с координатами $x $y"
    }

    fun drawPoint(x: Int, y: Float): String {
        return "Точка -> с координатами $x $y"
    }

    fun drawPoint(x: Float, y: Int): String {
        return "Точка -> с координатами $x $y"
    }

    fun drawPoint(x: Float, y: Float): String {
        return "Точка -> с координатами $x $y"
    }
}

