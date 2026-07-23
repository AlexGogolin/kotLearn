package org.example.lesson_11


class Subscriber3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val subscribers = listOf(
        Subscriber3("Alex", 8955464145, "Reddit"),
        Subscriber3("Jack", 8956546445, "null"),
        Subscriber3("John", 6516546445),
        Subscriber3("Marta", 8956556845, "Adidas"),
        Subscriber3("Alice", 8956586445),
    )

    val subscribersCompany = subscribers.filter {it.company != null}
    for (company in subscribersCompany) {
        println("${company.company}")
    }
}