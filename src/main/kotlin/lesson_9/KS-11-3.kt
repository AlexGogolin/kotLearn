package org.example.lesson_9

const val SPEAKING = "разговаривает"
const val MUTED = "микрофон выключен"
const val SILENCED = "пользователь заглушен"

class Room(
    val wallPaper: String,
    val nameOfRoom: String,
    val listOfUsers: MutableList<User>,
) {
    fun addNewUser(user: User) {
        listOfUsers.add(user)
    }
    fun changeStatus(username: String, status: String) {
        val user = listOfUsers.find { it.name == username }
        user?.status = status
    }
}

class User(
    val id: Int,
    val name: String,
    val avatar: String,
    var status: String,
)

fun main() {
    val room = Room("space.png", "Frends", mutableListOf())
}