package org.example.Lesson_3

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"

fun main() {
    println("Пожалуйста авторизуйтесь")
    println("Введите логин")
    val login = readln()
    when (login) {
        USER_LOGIN -> {
            val password = readln()
            when (password) {
                USER_PASSWORD -> println("Добро пожаловать")
                else -> println("Неверный пароль")
            }
        }

        else -> println("Пользователь не найден, зарегистрируйтесь")
    }
}