package org.example.lesson_9

fun main() {
    class User(
        val id: Int,
        val login: String,
        val password: String,
        val mail: String,
    )

    val user1 = User(34, "Biba", "sjf7234ad", "slnff@mail.com")
    val user2 = User(31, "Bibadg", "sdgb25", "s3463gsxgff@mail.com")

    println("${user1.id} - ${user1.login} - ${user1.password} - ${user1.mail}")
    println("${user2.id} - ${user2.login} - ${user2.password} - ${user2.mail}")
}