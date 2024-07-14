package org.example.lesson_20

fun main() {
    val elements = listOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "10")

    val listLambdas = elements.map { element ->
        { println("Нажат элемент $element") }
    }

    val printEvenElements: (List<() -> Unit>) -> Unit = { lambdas ->
        for (i in lambdas.indices) {
            if (elements[i].toInt() % 2 == 0) {
                lambdas[i]()
            }
        }
    }
    printEvenElements(listLambdas)
}