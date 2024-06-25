package org.example.lesson_11

//- Категория рецепта
//- Рецепт
//- Ингредиент

class Categories(

    val id: Int,
    val name: String,
    val image: String,
    val description: String,
    val favorites: Boolean,

) {

}

class Recipe(

    val name: String,
    val image: String,
    val portions: Int,
    val ingredientName: String,
    val idOfIngredient: Int,
    val amountOfIngredient: Int,
    val favorites: Boolean,

) {

}

class Ingredient(

    val name: String,
    val idOfIngredient: Int,

) {

}