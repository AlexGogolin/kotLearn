package org.example.lesson_11

class Subscriber5(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printSubscriber() {
        println("Name: $name, PhoneNumber: $phoneNumber Company: $company")
    }
}

fun main() {
    val subscribers = mutableListOf<Subscriber5>()
    while (true) {
        println("Введите данные абонента")
        println("Введите Имя:")
        val name = readln()
        println("Введите номер телефона: и компанию")
        val phoneNumber: String = readln()
        println("Введите название компании:")
        val company: String? = readln().ifEmpty { null }
        var phoneNumberLong: Long?
        try {
            phoneNumberLong = phoneNumber.toLong()
        } catch (e: NumberFormatException) {
            println(e)
            phoneNumberLong = null
        }
        if (phoneNumberLong != null) {
            subscribers.add(Subscriber5(name, phoneNumberLong, company))
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