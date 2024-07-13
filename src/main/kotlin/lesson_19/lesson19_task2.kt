package org.example.lesson_19

enum class Categories() {
    CLOTHING,
    OFFICE_SUPPLIES,
    MISCELLANEOUS;

    fun setCategories(categories: Categories) {
        when (categories) {
            Categories.CLOTHING -> println("Clothing")
            Categories.OFFICE_SUPPLIES -> println("Office supplies")
            Categories.MISCELLANEOUS -> println("Miscellaneous")
        }
    }
}

class Product(private val name: String, private val id: Int, private val category: Categories) {
    fun printInfo() {
//        println("Название: $name, ID: $id, Категория: ${setCategories(category)}")
    }
}

