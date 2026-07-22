package org.example.lesson_8

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    fun rollDice(): Int = (1..6).random()
    var humanScore: Int = 0
    var computerScore: Int = 0

    for (i in 1..5) {
        humanScore += rollDice()
        println("Кубик бросил человек, выпало: ${rollDice()}")
        computerScore += rollDice()
        println("Кубик бросил компьютер, выпало: ${rollDice()}")
    }

    if (humanScore == computerScore) {
        println("Победила дружба, счет $computerScore : $humanScore")
    }else if(computerScore < humanScore) {
        println("Победило человечество, счет $computerScore : $humanScore")
    }else{
        println("Победила машина, счет $computerScore : $humanScore")
    }

}