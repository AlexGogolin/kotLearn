package org.example.lesson_15

class Person(
    login: String,
    password: String,
) {
    var _login: String = login
        set(value) {
            field = value
            println("Логин изменен на $field")
        }

    var _password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {

    val user = Person("ivan_ivanov", "parol6")

    user._password = "123"
    println("Ваш текущий пароль: ${user._password}")
    user._login = "ivan_the_great"
}