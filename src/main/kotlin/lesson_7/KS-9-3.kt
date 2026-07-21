package org.example.lesson_7

fun main() {
    val quantityOfIngredients = mutableListOf<Int>(2, 50, 15)
    println("Сколько порций вы бы хотели?")
    val quantityOfPortions = readln().toInt()

    val result =  quantityOfIngredients.map{ ingredient ->
        ingredient * quantityOfPortions
    }

    println("На $quantityOfPortions порций вам понадобится: Яиц – ${result[0]} шт.," +
            " молока – ${result[1]} мл., сливочного масла – ${result[2]} гр.")
}