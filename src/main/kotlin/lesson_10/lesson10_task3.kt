package org.example.lesson_10

fun main() {

    println("Для генерации пароля введите количество символов: ")
    val numberOfPassword = readln().toInt()

    println("Ваш пароль: ${generatePassword(numberOfPassword)}")
}

fun generatePassword(length: Int): String {
    val digits = 0..9
    val specialChars = "!\"#$%&'()*+,-./ "

    val password = StringBuilder()

    var char: String
    var evenIndex = true

    for (index in 0 until length) {
        char = if (evenIndex) digits.random().toString()
        else specialChars.random().toString()

        password.append(char)
        evenIndex = !evenIndex // переключаем четность индекса
    }
    return password.toString()
}