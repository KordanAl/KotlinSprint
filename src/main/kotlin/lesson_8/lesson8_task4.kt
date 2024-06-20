package org.example.lesson_8

fun main() {

    val ingredients = arrayOf("Мука", "Молоко", "Яйца", "Сахар", "Соль")

    println("Список ингредиентов: ${ingredients.joinToString()}")

    var toReplace: String
    var indexToReplace: Int

    do {
        println("Какой ингредиент вы хотите заменить? ")
        toReplace = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

        indexToReplace = ingredients.indexOf(toReplace)

        if (indexToReplace == -1) {
            println("Ингредиент не найден в списке.")

        } else {
            println("На что вы хотите заменить ингредиент \"$toReplace\"? ")
            break
        }
    } while (true)

    val replacement = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

    ingredients[indexToReplace] = replacement

    println("Готово! Вы сохранили следующий список: ${ingredients.joinToString()}")

}