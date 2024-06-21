package org.example.lesson_9

fun main() {
    println("Введите 5 названий ингредиентов блюда через запятую и пробел: ")

    val ingredients = mutableListOf<String>()
    var inputIngredient: String

    do {
        inputIngredient = readln()
        ingredients += inputIngredient.split(", ").sorted()

        if (ingredients.size < 5) {
            println("Ошибка! Введите ровно 5 ингредиентов, разделяя их запятыми и пробелом:")
        } else {
            println("Вы ввели следующие ингредиенты: ")
            break
        }
    } while (ingredients.size < 5)

    println("${ingredients.joinToString().replaceFirstChar { it.titlecase() }}.")
}
