package org.example.lesson_11

class Subscriber4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printSubscriber() {
        println("Name: $name, PhoneNumber: $phoneNumber Company: $company")
    }
}

fun main() {
    val subscribers = mutableListOf<Subscriber4>()
    while (true) {
        println("Введите данные абонента")
        println("Введите Имя:")
        val name = readln()
        println("Введите номер телефона: и компанию")
        val phoneNumber: Long? = readln().toLongOrNull()
        println("Введите название компании:")
        val company: String? = readln().ifEmpty { null }
        if (phoneNumber != null) {
            subscribers.add(Subscriber4(name, phoneNumber, company))
        } else {
            println("Номер телефона обязателен!")
        }
        println("Хотите добавить еще контакт?")
        val answer = readln()

        if (!answer.equals("Да", ignoreCase = true)) {
            break
        }
    }
    subscribers.forEach {
        it.printSubscriber()
    }
}