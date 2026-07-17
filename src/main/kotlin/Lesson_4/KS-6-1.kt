package org.example.Lesson_4

fun main() {

    println("Создайте логин и пароль")
    println("Выберите логин")
    val login = readln()

    println("Выберите пароль")
    val password = readln()

    println("Заполните введеные ранее логин и пароль")
    println("Введите логин")
    var userLogin = readln()
    println("Введите пароль")
    var userPassword = readln()
    while(login != userLogin || password != userPassword){
        println("Повторите попытку")
        println("Введите логин")
        userLogin = readln()
        println("Введите пароль")
        userPassword = readln()
    }
    println("Авторизация прошла успешно")
}