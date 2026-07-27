package org.example.lesson_12

class Chat(
    val messageList: MutableList<Message> = mutableListOf(),
    var idCounter: Int = 1,
) {
    fun addMessage(message: String, author: String) {
        val newMessage = Message(idCounter, author, message)
        messageList.add(newMessage)
        idCounter++
    }

    fun addThreadMessage(message: String, author: String, parentMessageId: Int) {
        val newChildMessage = ChildMessage(idCounter, author, message, parentMessageId)
        messageList.add(newChildMessage)
        idCounter++
    }

    fun printChat() {
        val grouped = messageList.groupBy { message ->
            if (message is ChildMessage) {
                message.parentMessageId
            } else {
                message.id
            }
        }
        grouped.forEach { (key, messages) ->
            for (message in messages) {
                if (message is ChildMessage) {
                    println("\t${message.author} - ${message.text}")
                } else {
                    println("${message.author} - ${message.text}")
                }
            }
        }
    }
}

open class Message(
    val id: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    messageId: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(messageId, author, text)

fun main() {
    val chat = Chat()
    chat.addMessage("Alex", "Hallo")
    chat.addMessage("Bob", "Hi")
    chat.addThreadMessage("Alex", "How are yoU?", 1)
    chat.addThreadMessage("Bob", "Fine, go cs2?", 2)
    chat.addThreadMessage("Alex", "Go", 1)
    chat.printChat()
}