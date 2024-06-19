package org.example.lesson_8

fun main() {

    val ingredient1 = "Яйцо"
    val ingredient2 = "Помидор"
    val ingredient3 = "Зелень"
    val ingredient4 = "Соль"
    val ingredient5 = "Перец"

    val arrayOfIngredients = arrayOf("Яйцо", "Помидор", "Зелень", "Соль", "Перец")

    println("Какой ингридиент вы бы хотели найти?")
    val searchIngredient = readln()

    val foundIngredient: Boolean = arrayOfIngredients.any { it.equals(searchIngredient, ignoreCase = true) }

    if (foundIngredient) println("Ингредиент $searchIngredient в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")

}

