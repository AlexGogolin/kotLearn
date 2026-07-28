package org.example.lesson_14

class User(
    private val login: String,
) {
    private val password: String = "qwerty"
    fun isValidate(userPassword: String): Boolean {
        return userPassword == password
    }
}

fun main() {
    val user = User(login = "admin")
    println(user.isValidate("qwerty"))
}