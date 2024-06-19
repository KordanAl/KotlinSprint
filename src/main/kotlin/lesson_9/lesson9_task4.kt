package org.example.lesson_9

const val QUANTITY_OF_INGREDIENTS = 5

fun main() {

    println("Введите 5 названий ингредиентов блюда через запятую и пробел: ")

    var input: String
    var ingredients: MutableList<String>

    do {
        input = readln()

        ingredients =
            input
                .split(", ")
                .map { all -> all.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() } }
                .toMutableList()

        if (ingredients.size != QUANTITY_OF_INGREDIENTS) {
            println("Ошибка! Введите ровно 5 ингредиентов, разделяя их запятыми и пробелом.")
        } else {
            println("Вы ввели следующие ингредиенты: ")
        }
    } while (ingredients.size != QUANTITY_OF_INGREDIENTS)

    ingredients = ingredients.sorted().toMutableList()

    println(ingredients.joinToString())

}
