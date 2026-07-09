package org.example.Lesson_1

fun main() {
    var startTurn = "E2"
    var endTurn = "E4"
    var numOfTurn = 1

    var turn = "[$startTurn-$endTurn;$numOfTurn]"
    println(turn)

    startTurn = "D2"
    endTurn = "D3"
    numOfTurn = 2

    turn = "[$startTurn-$endTurn;$numOfTurn]"
    println(turn)
}