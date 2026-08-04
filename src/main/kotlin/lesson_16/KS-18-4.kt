package org.example.lesson_16

const val SIDES_OF_CUBE = 6

abstract class Parcel() {
    abstract fun packaging(): Int
}

class Rectangle(val height: Int, val width: Int, val length: Int) : Parcel() {
    override fun packaging(): Int {
        return height * width * length
    }
}

class Cube(val edgeLength: Int) : Parcel() {
    override fun packaging(): Int {
        return (edgeLength * edgeLength) * SIDES_OF_CUBE
    }
}