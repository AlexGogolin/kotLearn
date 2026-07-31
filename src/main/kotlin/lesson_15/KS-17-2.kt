package org.example.lesson_15

class Ship(name: String, val speed: Int, val base: String) {


    var name: String = name
        set(value) {
            if (value != field) {
                println("Имя не может быть изменено")
            }
        }
}

fun main() {
    val ship = Ship("Anna", 13, "Sukhum")
    ship.name = "Bob"
}