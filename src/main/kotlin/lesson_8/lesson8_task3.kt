package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("Яйцо", "Помидор", "Зелень", "Соль", "Перец")

    println("Какой ингридиент вы бы хотели найти?")
    val searchIngredient = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

    if (searchIngredient in arrayOfIngredients) println("Ингредиент $searchIngredient в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")

}