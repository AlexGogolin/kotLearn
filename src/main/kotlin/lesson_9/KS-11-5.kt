package org.example.lesson_9

class Forum {
    private var nextUserId: Int = 1
    private val users: MutableList<ForumUser> = mutableListOf()
    private val messages: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String): ForumUser {
        val newUser = ForumUser(nextUserId, userName)
        nextUserId++
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String) {
        val oldUser = users.find { it.userId == authorId }
        if (oldUser != null) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
        }
    }

    fun printThread() {
        for (message in messages) {
            val author = users.find { it.userId == message.authorId }
            println("${author!!.userName}: ${message.message}")
        }
    }
}

class ForumUser(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

fun main() {
    val forum = Forum()
    forum.createNewUser("Alex")
    forum.createNewUser("Nina")
    forum.createNewMessage(1, "Hallo")
    forum.createNewMessage(2, "Hi")
    forum.printThread()

}