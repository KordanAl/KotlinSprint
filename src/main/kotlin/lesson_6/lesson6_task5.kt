package org.example.lesson_6

const val SUM_NUMBER: Byte = 9
const val MIN_NUMBER_1: Byte = 1
const val MAX_NUMBER_1: Byte = 8

fun main() {

    var numberOfAttempts: Byte = 3
    var randomNumberOne: Int
    var randomNumberTwo: Int

    randomNumberOne = (MIN_NUMBER_1..MAX_NUMBER_1).random()
    randomNumberTwo = SUM_NUMBER - randomNumberOne

    val sumOfNumbers: Int = randomNumberOne + randomNumberTwo

    var correctNumber: Boolean = false
    var userInput: Int

    while (!correctNumber && numberOfAttempts > 0) {
        if (numberOfAttempts < 3) println("Введите сумму чисел $randomNumberOne + $randomNumberTwo: ")
        else println(
            "У вас есть $numberOfAttempts попытки," +
                    " чтобы пройти проверку, введите сумму чисел $randomNumberOne + $randomNumberTwo: "
        )
        userInput = readln().toInt()

        if (userInput == sumOfNumbers) {
            println("Добро пожаловать!")
            correctNumber = true
        } else {
            println("Неверно, осталось попыток: ${--numberOfAttempts}")

            do {
                randomNumberOne = (MIN_NUMBER_1..MAX_NUMBER_1).random()
                randomNumberTwo = SUM_NUMBER - randomNumberOne
            } while (randomNumberTwo < MIN_NUMBER_1 || randomNumberTwo > MAX_NUMBER_1)

            if (numberOfAttempts <= 0) println("Доступ запрещен")
        }
    }

}