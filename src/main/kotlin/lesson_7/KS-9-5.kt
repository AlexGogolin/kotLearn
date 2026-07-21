package org.example.lesson_7

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val listOfIngredients = mutableListOf<String>()
    var userIngredient: String
    for (i in 1..5) {
        println("Добавьте ингредиент")
        userIngredient = readln()
        listOfIngredients.add(userIngredient)
    }

    val sortedStringOfIngredients = listOfIngredients.distinct().sorted().joinToString(", ").replaceFirstChar { it.uppercase() }
    println(sortedStringOfIngredients)
}