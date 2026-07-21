package org.example.lesson_7

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val listOfIngredients = mutableListOf<String>()
    var count = 1
    var userIngredient: String
    while (count <= 5) {
        println("Добавьте ингредиент")
        userIngredient = readln()
        if (listOfIngredients.any { it.equals(userIngredient, ignoreCase = true) }) {
            println("Такой ингредиент уже есть")
            continue
        } else {
            listOfIngredients.add(userIngredient)
            count++
        }
    }

    val sortedStringOfIngredients = listOfIngredients.sorted().joinToString(", ").replaceFirstChar { it.uppercase() }

    println(sortedStringOfIngredients)
}