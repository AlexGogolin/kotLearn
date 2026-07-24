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
    println("Введите номер телефона:")
    val phoneNumber: String = readln()
    var phoneNumberLong: Long?
    try {
        phoneNumberLong = phoneNumber.toLong()
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
        phoneNumberLong = null
    }
}