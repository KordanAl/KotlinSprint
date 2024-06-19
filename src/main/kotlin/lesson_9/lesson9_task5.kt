package org.example.lesson_9

const val FIRST_INGREDIENT: Byte = 1
const val QUANTITY_OF_INGREDIENTS: Byte = 5

fun main() {

    println("Введите $QUANTITY_OF_INGREDIENTS названий ингредиентов:")

    val ingredients: MutableSet<String> = mutableSetOf()

    (FIRST_INGREDIENT..QUANTITY_OF_INGREDIENTS).forEach {
        print("Введите название ингредиента $it: ")
        var inputIngredient = readln()

        while (inputIngredient.isBlank() || ingredients.contains(inputIngredient)) {
            if (inputIngredient.isBlank()) {
                println("Название ингредиента не может быть пустым. Пожалуйста, попробуйте снова.")
            } else {
                println("Этот ингредиент уже был введен. Пожалуйста, введите другой ингредиент.")
            }
            print("Введите название ингредиента $it: ")
            inputIngredient = readln()
        }
        ingredients.add(inputIngredient.lowercase())
    }

    val sortedIngredients = ingredients.sorted()
    println("Ингредиенты: ${
        sortedIngredients.joinToString().replaceFirstChar {
            if (it.isLowerCase()) it.titlecase() else it.toString()
        }
    }.")

}
