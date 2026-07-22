package org.example.lesson_8

fun validateInput(login: String, password: String): Boolean {
    val isValidate = login.length >= 4 && password.length >= 4
    return isValidate
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()

    if (!validateInput(login = login, password = password)) {
        println("Логин или пароль недостаточно длинные")
    }
}