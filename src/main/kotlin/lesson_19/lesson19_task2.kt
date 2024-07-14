package org.example.lesson_19

enum class Category() {
    CLOTHING,
    OFFICE_SUPPLIES,
    MISCELLANEOUS;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHING -> "Clothing"
            OFFICE_SUPPLIES -> "Office supplies"
            MISCELLANEOUS -> "Miscellaneous"
        }
    }
}

class Product(private val id: Int, private val name: String, private val category: Category) {
    fun getInfoProduct() {
        println("Название: $name, ID: $id, Категория: ${category.getCategoryName()}")
    }
}

fun main() {

    val product1 = Product(1, "Рубашка", Category.CLOTHING)
    val product2 = Product(2, "Карандаш", Category.OFFICE_SUPPLIES)
    val product3 = Product(3, "Гель для душа", Category.MISCELLANEOUS)

    product1.getInfoProduct()
    product2.getInfoProduct()
    product3.getInfoProduct()
}

