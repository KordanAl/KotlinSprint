package org.example.lesson_7

fun main() {
    var randomCode: Int
    var userCode: Int

    do {
        randomCode = (1000..9999).random()
        println("Ваш код авторизации: $randomCode")
        println("Введите код, чтобы авторизоваться:")
        userCode = readln().toInt()

        if (userCode == randomCode) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно, попробуйте еще раз. \n")
        }
    } while (true)
}
