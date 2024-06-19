package org.example.lesson_9

fun main() {

    val basicMutableList = mutableListOf("Мука", "Яйца", "Сахар", "Соль")

    println("В рецепте есть базовые ингредиенты: ")
    basicMutableList.forEach { println(it) }

    println("Желаете добавить еще?")
    val addIngredient = readln()

    if (addIngredient.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() } != "Да") return
    else println("Какой ингредиент вы хотите добавить?")
    val inputOfIngredient = readln()

    basicMutableList.add(inputOfIngredient.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() })

    println("Теперь в рецепте есть следующие ингредиенты: ")
    basicMutableList.forEach { println(it) }

}
