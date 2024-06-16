package org.example.lesson_5

fun main() {
    //  3 рандомных числа в диапазоне преобразуем в сет и после делаем, чтобы сет выводился без квадратных скобок
    val winningNumber = (0..42).shuffled().take(3).toSet()
    val stringWinningNumber = winningNumber.joinToString(separator = ", ", prefix = "", postfix = ".")

    println(
        """
        Чтобы выйграть в лотерреию нужно угадать три числа от 0 до 42.
        Введите первое число:
        """.trimIndent(),
    )
    val number1 = readLine()?.toInt()

    println("Введите второе число:")
    val number2 = readLine()?.toInt()

    println("Введите третье число:")
    val number3 = readLine()?.toInt()

    val enteredNumbers = listOf(number1, number2, number3).toSet()
    val matchingNumbers = enteredNumbers.intersect(winningNumber)

    when (matchingNumbers.size) {
        3 -> println("Поздравляем! Вы угадали все числа и выиграли джекпот!")
        2 -> println("Поздравляем! Вы угадали два числа и получаете крупный приз.")
        1 -> println("Поздравляем! Вы угадали одно число. Ваш выигрыш - утешительный приз.")
        else -> println("К сожалению, вы не угадали ни одного числа!")
    }

    println("Числами для выйгрыша были: $stringWinningNumber")
}
