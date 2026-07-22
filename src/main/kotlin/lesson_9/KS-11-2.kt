package org.example.lesson_9

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun setAboutUser() {
        println("Id: ${id}, Login: ${login}, Password: ${password}, mail: ${mail}, bio: ${bio}")
    }

    fun rewriteBio() {
        val newBio = readln()
        bio = newBio
    }

    fun setNewPassword() {
        println("Введите текущий пароль:")
        val oldPassword = readln()
        if (oldPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            this.password = newPassword
            println("Пароль изменен")
        } else {
            println("Пароль не верен")
        }
    }
}

fun main() {
    val user = User2(12, "admin", "qwerty", "dada@mail.com")

    user.rewriteBio()
    user.setNewPassword()

    println("Id: ${user.id}, Login: ${user.login}, Password: ${user.password}, mail: ${user.mail}, bio: ${user.bio}")
}