package org.example.lesson_7

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    println("Добавьте ингредиенты")
    val userIngredients = readln()
    val userIngredientsList: List<String> = userIngredients.split(", ")
    val result = userIngredientsList.sorted()

    println(result)
}