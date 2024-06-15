package org.example.lesson_5

const val SUM_NUMBER: Int = 234
const val MIN_NUMBER: Byte = 1
const val MAX_NUMBER: Int = 233

fun main() {
    var randomNumberOne: Int
    var randomNumberTwo: Int

    do {
        randomNumberOne = (MIN_NUMBER..MAX_NUMBER).random()
        randomNumberTwo = SUM_NUMBER - randomNumberOne
    } while (randomNumberTwo < MIN_NUMBER || randomNumberTwo > MAX_NUMBER)

    println("Введите сумму чисел $randomNumberOne + $randomNumberTwo")

    val isSumNumber = readLine()?.toInt()

    if (isSumNumber == SUM_NUMBER) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
