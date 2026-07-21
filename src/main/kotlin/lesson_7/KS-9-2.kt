package org.example.lesson_7

import java.util.Locale
import java.util.Locale.getDefault

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val ingredients = mutableListOf<String>("Молоко", "Яйца", "Хлеб")
    println("В рецепте есть базовые ингредиенты: $ingredients")

    println("Желаете добавить еще нгредиент?")
    val answerOfAdd = readln()


    if (!answerOfAdd.equals("Да", ignoreCase = true)) {
        return
    }

    println("Какой ингредиент вы хотите добавить?")
    val newIngredients = readln()

    ingredients += newIngredients

    println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
}