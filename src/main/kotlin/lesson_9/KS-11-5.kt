package org.example.lesson_9

class Forum {
    private var nextUserId: Int = 1
    private val users: MutableList<ForumUser> = mutableListOf()
    private val messages: MutableList<ForumMessage> = mutableListOf()

    fun createNewUser(userName: String): ForumUser {
        val builder = ForumUser.Builder()
        val newUser = builder.build(nextUserId, userName)
        nextUserId++
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String) {
        val oldUser = users.find { it.userId == authorId }
        if (oldUser != null) {
            val builder = ForumMessage.Builder()
            val newMessage = builder.build(authorId, message)
            messages.add(newMessage)
        }
    }

    fun printThread() {
        for (message in messages) {
            val author = users.find { it.userId == message.authorId }
            println("${author?.userName ?: "Неизвестный"} : ${message.message}")
        }
    }
}

class ForumUser private constructor(
    val userId: Int,
    val userName: String,
) {
    class Builder {
        fun build(userId: Int, userName: String): ForumUser {
            return ForumUser(userId, userName)
        }
    }
}

class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        fun build(authorId: Int, message: String): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}

fun main() {
    val forum = Forum()
    forum.createNewUser("Alex")
    forum.createNewUser("Nina")
    forum.createNewMessage(1, "Hallo")
    forum.createNewMessage(2, "Hi")
    forum.createNewMessage(1, "How are you?")
    forum.createNewMessage(2, "Fine, thx")
    forum.printThread()
}