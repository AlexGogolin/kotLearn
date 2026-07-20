package org.example.lesson_6

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val ingredients = arrayOf("Свекла", "Майонез", "Мясо", "Картофель", "Капуста", "Лук")

    println("Какой ингредиент вы ищете?")
    val ingredient = readln()
    var isFoundIngredient: Boolean = false

    for (i in ingredients) {
        if (ingredient == i) {
            println("Ингредиент $ingredient в рецепте есть")
            isFoundIngredient = true
            break
        }
    }
    if (!isFoundIngredient) {
        println("Такого ингредиента в рецепте нет")
    }

}

