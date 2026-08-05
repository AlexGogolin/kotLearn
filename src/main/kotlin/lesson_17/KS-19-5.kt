package org.example.lesson_17

enum class Gender(val translateGender: String) {
    MALE("Муж"),
    FEMALE("Жен")
}

class Person(
    val name: String,
    val gender: Gender,
)

fun main() {
    val listOfPersons = mutableListOf<Person>()
    var counter = 1
    println("В картотеку нужно внести 5 человек. Сначала вводите имя, потом пол Муж или Жен, пример: \"Алексей Муж\" ")

    while (listOfPersons.size < 5) {
        println("№$counter Пожалуйста введите имя:")
        val name = readln()
        println("теперь пол: \"Муж\" или \"Жен\"")
        val genderInput = readln()

        val gender = when (genderInput) {
            "Муж" -> Gender.MALE
            "Жен" -> Gender.FEMALE
            else -> {
                println("Ошибка! Неверный пол. Попробуем еще раз для этого человека.")
                continue
            }
        }
        listOfPersons.add(Person(name, gender))
        counter++
    }
    println("Итоговый список:")
    listOfPersons.forEach { println("${it.name} ${it.gender.translateGender}") }
}