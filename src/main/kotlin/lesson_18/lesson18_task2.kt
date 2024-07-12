package org.example.lesson_18

open class TypesOfDice {

    open fun rollTheDice(): String = ""
}

class Dice4(private val number: IntRange = 1..4) : TypesOfDice() {
    override fun rollTheDice(): String {
        return "The result of throwing a 4-sided die is the following: ${number.random()}"
    }
}

class Dice6(private val number: IntRange = 1..6) : TypesOfDice() {
    override fun rollTheDice(): String {
        return "The result of throwing a 6-sided die is the following: ${number.random()}"
    }
}

class Dice8(private val number: IntRange = 1..8) : TypesOfDice() {
    override fun rollTheDice(): String {
        return "The result of throwing a 8-sided die is the following: ${number.random()}"
    }
}

fun main() {

    val dice: TypesOfDice = Dice4()
    val dice2: TypesOfDice = Dice6()
    val dice3: TypesOfDice = Dice8()

    val arrayOfDice = arrayOf<TypesOfDice>(dice, dice2, dice3)
    showRollAllDice(arrayOfDice)
}

fun showRollAllDice(dice: Array<TypesOfDice>) {
    dice.forEach { println(it.rollTheDice()) }
}