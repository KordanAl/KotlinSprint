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
    val recipes: List<Recipe>
)

class Recipe(
    val name: String,
    val image: String,
    val portions: Int,
    val amountOfIngredient: Int,
    val favorites: Boolean,
    val ingredients: List<Ingredient>,
)

class Ingredient(
    val id: Int,
    val name: String,
    val amount: Int,
    val unit: String
)