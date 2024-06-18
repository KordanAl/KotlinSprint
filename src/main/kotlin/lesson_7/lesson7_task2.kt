package org.example.lesson_7

fun main() {

    var randomCode: Int
    var userCode: Int
    val codeMatched = false

    while (!codeMatched) {
        randomCode = (1000..9999).shuffled().take(1).first()
        println("Ваш код авторизации: $randomCode")
        println("Введите код, чтобы авторизоваться:")
        userCode = readln().toInt()

        if (userCode == randomCode) {
            println("Добро пожаловать!")
            return
        } else {
            println("Неверно, попробуйте еще раз. \n")
        }
    }

}
