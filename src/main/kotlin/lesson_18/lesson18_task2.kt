package org.example.lesson_18

open class Dice(private val sides: Int) {

    open fun rollTheDice() {
        val result = (1..sides).random()
        println("The result of throwing a $sides-sided die is the following: $result")
    }
}

class FourSidedDice() : Dice(4)
class SixSidedDice() : Dice(6)
class EightSidedDice() : Dice(8)

fun main() {

    val dice: Dice = FourSidedDice()
    val dice2: Dice = SixSidedDice()
    val dice3: Dice = EightSidedDice()

    val arrayOfDice = arrayOf<Dice>(dice, dice2, dice3)
    showRollAllDice(arrayOfDice)
}

fun showRollAllDice(dice: Array<Dice>) {
    dice.forEach { it.rollTheDice() }
}