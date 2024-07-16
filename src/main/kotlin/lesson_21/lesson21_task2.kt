package org.example.lesson_21

fun Collection<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 234, 851, 1117)
    println("Сумма всех четных чисел в списке: ${numbers.evenNumbersSum()}")

    val numbers1 = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 234, 851, 1117)
    println("Сумма всех четных чисел в списке: ${numbers1.evenNumbersSum()}")
}