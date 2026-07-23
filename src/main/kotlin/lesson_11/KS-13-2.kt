package org.example.lesson_11

class Subscriber2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val subscriber = Subscriber2("Alex", 89184261273)
    subscriber.printInfo()
}