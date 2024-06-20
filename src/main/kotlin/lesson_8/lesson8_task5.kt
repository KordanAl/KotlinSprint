package org.example.lesson_8

fun main() {

    println("Введите количество ингредиентов: ")
    val quantityOfIngredients = readln().toInt()

    val ingredients = Array<String>(quantityOfIngredients) { "" }

    for (i in 0 until quantityOfIngredients) {
        println("Введите ингредиент ${i + 1}: ")
        ingredients[i] = readln().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }

    println("Ингредиенты: ${ingredients.joinToString()}.")

}