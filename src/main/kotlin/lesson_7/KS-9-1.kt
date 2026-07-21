package org.example.lesson_7

fun main() {
    val ingredients = listOf<String>("Молоко", "Масло", "Чай", "Хлеб")
    println("В рецепте есть следующие ингредиенты: $ingredients")

    ingredients.forEach { println(it) }
}