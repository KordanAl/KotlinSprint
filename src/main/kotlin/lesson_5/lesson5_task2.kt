package org.example.lesson_5

const val AGE_OF_MAJORITY: Byte = 18

fun main() {
    val thisYear: Int = 2024
    val yearOfMajority: Int = thisYear - AGE_OF_MAJORITY

    println("Введите свой год рождения:")

    val userRestriction = readLine()!!.toInt()

    if (userRestriction <= yearOfMajority) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Доступ к скрытому контенту запрещен")
    }
}
