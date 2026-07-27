package org.example.lesson_13

abstract class Forum(
    val author: String,
) {
    abstract fun readMessage(text: String): String
    abstract fun postMessage(text: String): String
}

class User(
    author: String,
) : Forum(author) {
    override fun readMessage(text: String): String = "Пользователь $author, прочитал: $text"
    override fun postMessage(text: String): String = "Пользователь $author, написал: $text"
}

class Admin(
    author: String,
) : Forum(author) {
    override fun readMessage(text: String): String = "Администратор $author, прочитал: $text"
    override fun postMessage(text: String): String = "Администратор $author, написал: $text"
    fun deleteUser(user: User) {
        println("Администратор $author удалил пользователя ${user.author}")
    }

    fun deleteMessage(messageText: String) {
        println("Администратор $author удалил сообщение $messageText")
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val admin = Admin("admin")
    val user = User("Niko")

    println(admin.postMessage("Hi all"))
    println(user.postMessage("Hi everyone"))
    println(admin.readMessage("Hi everyone"))
    admin.deleteMessage("Hi everyone")
    admin.deleteUser(user)
}