package org.example.lesson_9

fun main() {

    val ingredients: List<String> = listOf("Мука", "Молоко", "Яйца", "Сахар", "Соль")

    println("В рецепте есть следующие ингредиенты: ")
    ingredients.forEach { println(it) }

}