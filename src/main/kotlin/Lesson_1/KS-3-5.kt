package org.example.Lesson_1

fun main() {
    val serverMessage = "D2-D4;0"
    val parseMessage = serverMessage.split(";", "-")

    val startCell = parseMessage[0]
    val endCell = parseMessage[1]
    val moveNumber = parseMessage[2]

    println(startCell)
    println(endCell)
    println(moveNumber)
}