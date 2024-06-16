package org.example.lesson_5

const val ONE_NUMBER = 10
const val TWO_NUMBER = 35

fun main() {
    println(
        """
        Чтобы выйграть в лотерреию нужно угадать два числа от 0 до 42.
        Введите первое число:
        """.trimIndent(),
    )

    val number1 = readln().toInt()

    println("Введите второе число:")

    val number2 = readln().toInt()

    if (number1 == ONE_NUMBER && number2 == TWO_NUMBER || number2 == ONE_NUMBER && number1 == TWO_NUMBER) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (number1 != ONE_NUMBER && number2 == TWO_NUMBER || number1 == ONE_NUMBER && number2 != TWO_NUMBER) {
        println("Поздравляем! Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Числа которые нужны были для победы: $ONE_NUMBER и $TWO_NUMBER.")
}
