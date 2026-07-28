package org.example.lesson_13

interface Search {
    fun searchAccessories() {
        println("Search Accessories")
    }
}

abstract class Product(
    val name: String,
    var amount: Int,
)

class Instrument(
    name: String,
    amount: Int,
) : Product(name, amount), Search

class Accessory(
    name: String,
    amount: Int,
) : Product(name, amount)