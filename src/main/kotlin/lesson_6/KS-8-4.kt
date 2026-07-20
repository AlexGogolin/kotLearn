package org.example.lesson_6

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    var isFoundIngredient: Boolean = false
    val ingredients = arrayOf("Свекла", "Майонез", "Мясо", "Картофель", "Капуста", "Лук")
    println(ingredients.joinToString(", "))

    println("Какой ингредиент вы хотели бы заменить?")

    var userIngredient = readln()

    for (i in ingredients.indices) {
        if (ingredients[i] == userIngredient) {
            println("Какой ингредиент хотели бы добавить?")
            userIngredient = readln()
            ingredients[i] = userIngredient
            isFoundIngredient = true
        }
    }
    if (!isFoundIngredient) {
        println("Такого ингредиента нет!")
    }else{
        println("Готово! Вы сохранили следующий список: ${ingredients.joinToString(separator = ", ",
            prefix = "[",
            postfix = "]")}")
    }


}