package org.example.lesson_6

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    println("Сколько ингредиентов вы планируете?")
    val quantityOfIngredients = readln().toInt()

    val listOfIngredients = Array(quantityOfIngredients) { " " }

    for (i in 0..quantityOfIngredients - 1) {
        println("Запишите ингредиент №${i+1}:")
        val userIngredient = readln()
        listOfIngredients[i] = userIngredient
    }
    println("Ваш список ${listOfIngredients.joinToString(", ")}")
}