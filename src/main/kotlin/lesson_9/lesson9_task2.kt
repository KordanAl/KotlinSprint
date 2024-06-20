package org.example.lesson_9

fun main() {

    val basicMutableList = mutableListOf("Мука", "Яйца", "Сахар", "Соль")

    println("В рецепте есть базовые ингредиенты: ")
    basicMutableList.forEach { println(it) }

    println("Желаете добавить еще?")
    val addIngredient = readln()

    if (addIngredient.lowercase() != "да") return
    else println("Какой ингредиент вы хотите добавить?")

    val inputOfIngredient = readln().replaceFirstChar { it.titlecase() }

    basicMutableList.add(inputOfIngredient)

    println("Теперь в рецепте есть следующие ингредиенты: ")
    basicMutableList.forEach { println(it) }

}