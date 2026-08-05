package org.example.lesson_17

enum class Categories(
    val nameOfCategory: String,
) {
    BOOKS("Книги"),
    TOYS("Игрушки"),
    TOOLS("Инструменты");

    fun printCategoryName(): String {
        return nameOfCategory
    }
}

class Product(
    val name: String,
    val Id: Int,
    val category: String,
) {
    fun printInfo() {
        val listOfCategories = Categories.entries
        val filteredCategory = listOfCategories.find { category == it.nameOfCategory }
        val nameOfCategory = filteredCategory?.printCategoryName()
        println("Название товара: $name, ID товара: $Id, Категория товара: $nameOfCategory")
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val book1 = Product("1984", 1, "Книги")
    val tool1 = Product("Hummer", 2, "Инструменты")
    val toy1 = Product("Lego", 3, "Игрушки")
    book1.printInfo()
    tool1.printInfo()
    toy1.printInfo()

}