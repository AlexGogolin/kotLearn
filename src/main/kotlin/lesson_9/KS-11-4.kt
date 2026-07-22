package org.example.lesson_9


class Category(
    val title: String,
    val wallpaper: String,
    val recipes: List<Recipe>
)
class Recipe(
    val id: Int,
    val title: String,
    val wallpaper: String,
    val ingredients: List<Ingredient>,
)
class Ingredient(
    val name: String,
    val quantity: Int,
    val measurement: String,
)
fun main() {

}