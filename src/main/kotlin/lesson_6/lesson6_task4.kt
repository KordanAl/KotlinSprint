package org.example.lesson_6

const val MIN_NUMBER: Byte = 1
const val MAX_NUMBER: Byte = 9

fun main() {

    var numberOfAttempts: Byte = 5
    val randomNumber = (MIN_NUMBER..MAX_NUMBER).random()

    var userNumber: Int?

    while (numberOfAttempts >= 0) {
        println("Угадайте число от 1 до 9: ")
        userNumber = readln().toInt()

        if (userNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно, осталось попыток: ${numberOfAttempts--}")
        }
    }
    println("Было загадано число $randomNumber")

}
