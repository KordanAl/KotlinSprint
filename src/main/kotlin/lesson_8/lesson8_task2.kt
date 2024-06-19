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

    var found: Boolean = false

    for (ingredient in arrayOfIngredients) {
        if (ingredient.equals(searchIngredient, ignoreCase = true)) {
            found = true
            break
        }
    }

    if (found) println("Ингредиент $searchIngredient в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")

}