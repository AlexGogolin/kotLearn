package org.example.lesson_16

class Order(
    val id: Int
) {
    fun printOrders(nameOfOrder: String) {
        println("Заказан товар: $nameOfOrder")
    }

    fun printOrders(orders: List<String>) {
        println("Заказаны следующие товары: ${orders.joinToString(", ")}")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.printOrders("D")
    order2.printOrders(listOf("A", "B", "C"))
}