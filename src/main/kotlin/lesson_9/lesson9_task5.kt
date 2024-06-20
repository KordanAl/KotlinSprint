package org.example.lesson_9

fun main() {

    println("Введите 5 названий ингредиентов, которые не повторяются.")

    val ingredients: MutableList<String> = mutableListOf()
    var inputIngredient: String

    while (ingredients.size < 5) {
        print("Введите название ингредиента ${ingredients.size + 1}: ")
        inputIngredient = readln().lowercase()

        if (inputIngredient.isBlank() || ingredients.contains(inputIngredient)) {
            println("Ошибка! Вы не ввели название или ингридиент повторяется. Пожалуйста, попробуйте снова.")
            continue
        }
        ingredients.add(inputIngredient)
    }
    println("Ингредиенты: ${ingredients.sorted().joinToString().replaceFirstChar { it.titlecase() }}.")

}