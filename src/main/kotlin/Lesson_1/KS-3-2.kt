package org.example.Lesson_1

fun main() {
    val name = "Татьяна"
    var secondName = "Андреева"
    val fatherName = "Сергеевна"
    var age = 22
    println("$secondName $name $fatherName Возраст: ${age - 2}")
    secondName = "Сидорова"
    println("$secondName $name $fatherName Возраст: ${age}")
}