package org.example.lesson_18

class OrderData {

    fun getInfoOrderData(
        orderNumber: Int,
        product: String
    ) {
        println("The following item has been ordered: $product")
    }

    fun getInfoOrderData(
        orderNumber: Int,
        productList: List<String>
    ) {
        println("The following items have been ordered: ${productList.joinToString()}")
    }
}

fun main() {

    val order1 = OrderData()
    val order2 = OrderData()

    order1.getInfoOrderData(
        1,
        "book"
    )

    order2.getInfoOrderData(
        2,
        listOf("book", "pencil")
    )
}