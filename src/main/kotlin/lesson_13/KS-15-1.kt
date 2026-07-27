package org.example.lesson_13

interface Swimmable {
    fun swim(): String
}

interface Flyable {
    fun fly(): String
}

interface Walking {
    fun walk(): String
}


class Crucian(val name: String) : Swimmable {
    override fun swim() = "$name плавает в воде"
    fun move() = println("${swim()}")
}

class Gull(val name: String) : Flyable, Swimmable {
    override fun swim() = "$name плавает в воде"
    override fun fly() = "$name умеет летать"
    fun move() = println("${swim()} и ${fly()}")
}

class Duck(val name: String) : Flyable, Swimmable, Walking {
    override fun swim() = "$name плавает в воде"
    override fun fly() = "$name умеет летать"
    override fun walk() = "$name ходит по земле"
    fun move() = println("${swim()} и ${fly()}, а так же ${walk()}")
}

fun main() {
    val animal1 = Crucian("Crucian")
    val animal2 = Gull("Gull")
    val animal3 = Duck("Duck")
    animal1.move()
    animal2.move()
    animal3.move()
}

