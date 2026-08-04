package org.example.lesson_16

open class Animal(val name: String) {
    open fun eat() {}
}

class Dog(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> кости")
    }
}

class Fox(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> ягоды")
    }
}

class Cat(name: String) : Animal(name) {
    override fun eat() {
        println("$name -> рыбу")
    }
}

fun main() {
    val dog = Dog("Рекс")
    val fox = Fox("Стеля")
    val cat = Cat("Барсик")

    val animalsList: List<Animal> = listOf(dog, fox, cat)
    for (animal in animalsList) {
        animal.eat()
    }
}