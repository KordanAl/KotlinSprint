package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("Мука", "Молоко", "Яйца", "Сахар", "Соль")

    println("Список ингредиентов: ${ingredients.joinToString()}")

    var toReplace: String

    do {
        println("Какой ингредиент вы хотите заменить? ")
        toReplace = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

        if (toReplace !in ingredients) {
            println("Ингредиент не найден в списке.")

        } else {
            println("На что вы хотите заменить ингредиент \"$toReplace\"? ")
            break
        }
    } while (toReplace !in ingredients)

    val replacement = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

    ingredients[ingredients.indexOf(toReplace)] = replacement

    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString()}")

}