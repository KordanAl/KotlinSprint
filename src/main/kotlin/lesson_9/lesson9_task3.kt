package org.example.lesson_9

fun main() {

    val ingredientsPerPortion = listOf(2, 50, 15) // яйца.шт, молоко.мл, масло.гр

    println("Введите количество порций:")
    val portions = readln().toInt()

    val totalIngredients = ingredientsPerPortion.map { it * portions }

    println(
        "На $portions порций омлета вам понадобится: " +
                "Яиц – ${totalIngredients[0]} шт., " +
                "молока – ${totalIngredients[1]} мл., " +
                "сливочного масла – ${totalIngredients[2]} гр."
    )

}