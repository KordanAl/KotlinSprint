package org.example.lesson_6

fun main() {
    var registration: Boolean = false
    var login: String = ""
    var password: String = ""

    println("Введите логин, чтобы зарегестрироваться:")
    login = readln()

    println("Введите пароль, чтобы зарегестрироваться:")
    Thread.sleep(1000)
    password = readln()

    println("Регистрация завершена.")
    Thread.sleep(1000)

    var loggedIn: Boolean = false
    var inputUsername: String = ""
    var inputPassword: String = ""

    while (!loggedIn) {
        println("\nВведите ваш логин: ")
        inputUsername = readln()

        println("Введите ваш пароль: ")
        Thread.sleep(1000)
        inputPassword = readln()

        if (inputUsername == login && inputPassword == password) {
            println("\nАвторизация прошла успешно")
            loggedIn = true
        } else {
            println("Логин или пароль введены , повторите попытку!")
            Thread.sleep(1000)
            continue
        }
    }
}
