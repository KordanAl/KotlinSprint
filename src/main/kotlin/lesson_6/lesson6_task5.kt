package org.example.lesson_6

const val MIN_NUMBER_1: Byte = 1
const val MAX_NUMBER_1: Byte = 8

fun main() {

    var numberOfAttempts: Byte = 3
    var randomNumberOne: Int
    var randomNumberTwo: Int
    var sumOfNumbers: Int
    var userInput: Int

    while (numberOfAttempts > 0) {

        randomNumberOne = (MIN_NUMBER_1..MAX_NUMBER_1).random()
        randomNumberTwo = (MIN_NUMBER_1..MAX_NUMBER_1).random()
        sumOfNumbers = randomNumberOne + randomNumberTwo

        if (numberOfAttempts < 3) {
            println("Введите сумму чисел $randomNumberOne + $randomNumberTwo: ")
        } else {
            println(
                "У вас есть $numberOfAttempts попытки," +
                        " чтобы пройти проверку, введите сумму чисел $randomNumberOne + $randomNumberTwo: ",
            )
        }
        userInput = readln().toInt()

        if (userInput == sumOfNumbers) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно, осталось попыток: ${--numberOfAttempts}")
        }
    }
    println("Доступ запрещен")

}
