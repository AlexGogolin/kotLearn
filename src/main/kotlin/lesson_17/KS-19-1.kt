package org.example.lesson_17

enum class Fish{
    GUPPY, ANGELFISH, GOLDFISH, SIAMESE_FIGHTING_FISH
}

fun main(){
    val fish = Fish.entries

    println("Вы можете добавить следующие виды рыб: ${fish.joinToString (", ")}")
}