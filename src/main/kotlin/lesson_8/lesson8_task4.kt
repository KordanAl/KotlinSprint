package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("Мука", "Молоко", "Яйца", "Сахар", "Соль")

    println("Список ингредиентов: ${ingredients.joinToString()}")

    println("Какой ингредиент вы хотите заменить? ")
    val toReplace =
        readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

    val foundIngredient: Boolean = ingredients.any { it == toReplace }
    val replacement: String

    if (!foundIngredient) {
        println("Ингредиент не найден в списке.")
    } else {
        println("На что вы хотите заменить ингредиент \"$toReplace\"? ")
        replacement =
            readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

        ingredients[ingredients.indexOf(toReplace)] = replacement
    }
    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString()}")

}