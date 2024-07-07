package org.example.lesson_16

class Dice {
    private val numberDice: Int = (1..6).random()

    fun getNumberInThrowDice() = numberDice
}

fun main() {
    val dice = Dice()
    println("The number that came up when rolling the dice: ${dice.getNumberInThrowDice()}")
}
