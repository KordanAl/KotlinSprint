package org.example.lesson_7

const val MIN_LENGTH_PASSWORD = 6
const val KINDS_CHARS = 3

fun main() {

    val letters: CharRange = 'a'..'z'
    val upLetters: CharRange = 'A'..'Z'
    val numbers: IntRange = 0..9

    var numberOfPassword: Int

    do {
        println("Для генерации пароля введите количество символов(не менее $MIN_LENGTH_PASSWORD): ")
        numberOfPassword = readln().toInt()

        if (numberOfPassword >= MIN_LENGTH_PASSWORD) {
            print("Ваш пароль: ")
        } else {
            println("Ошибка, длина пароля должна быть не менее $MIN_LENGTH_PASSWORD символов.")
        }
    } while (numberOfPassword < MIN_LENGTH_PASSWORD)

    val allChars = letters + upLetters + numbers
    var password = ""
    var randomChar: String

    // Добавляем 3 разных вида символа в пароль, чтобы в коде были все 3 вида символов
    // Поэтому из кол-ва символов в цикле for нужно вычесть 3 добавленных символа, для этого была создана константа

    password += letters.random() + upLetters.random().toString() + numbers.random()

    for (i in 1..(numberOfPassword - KINDS_CHARS)) {
        randomChar = allChars.random().toString()
        password += randomChar
    }

    val mixPassword = password.toList().shuffled().joinToString("")

    println(mixPassword)

}