package org.example.lesson_9

fun main() {
    println("Введите 5 названий ингредиентов, которые не повторяются.")

    val ingredients = mutableSetOf<String>()
    var inputIngredient: String

    while (ingredients.size < 5) {
        print("Введите название ингредиента ${ingredients.size + 1}: ")
        inputIngredient = readln().lowercase()

        if (inputIngredient.isBlank()) {
            println("Ошибка! Вы не ввели название ингридиента. Пожалуйста, попробуйте снова.")
            continue
        }
        ingredients.add(inputIngredient)
    }
    println("Ингредиенты: ${ingredients.sorted().joinToString().replaceFirstChar { it.titlecase() }}.")
}