package org.example.lesson_17

enum class Categories(
    val nameOfCategory: String,
) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    OTHERS("Разное");

    fun printCategoryName(): String {
        return nameOfCategory
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Categories,
) {
    fun printInfo() {
        println("Название товара: $name, ID товара: $id, Категория товара: ${category.printCategoryName()}")
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val hat = Product("DM", 1, Categories.CLOTHING)
    val pencil = Product("Parker", 2, Categories.STATIONERY)
    val toy1 = Product("Lego", 3, Categories.OTHERS)
    hat.printInfo()
    pencil.printInfo()
    toy1.printInfo()

}