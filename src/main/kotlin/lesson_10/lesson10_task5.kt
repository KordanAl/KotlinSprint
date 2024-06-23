package org.example.lesson_10

const val USER_LOGIN: String = "DankorAL"
const val USER_PASSWORD: String = "Abudalabashuneba2024"
const val LENGTH_TOKEN = 32

fun main() {
    val cart = listOf("Котлин", "Ноутбук", "Телефон")

    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()

    if (getAuthorize(login, password) != null) {
        println("Содержимое корзины:")
        cart.forEach { println(it) }
    }
}

fun getAuthorize(login: String, password: String): String? {
    val token: String
    if (login == USER_LOGIN && password == USER_PASSWORD) {
        println("Авторизация прошла успешно!")
        token = generateToken()
        return token
    } else {
        println("Ошибка! Логин или пароль введен неверно!")
        return null
    }
}

fun generateToken(): String {
    val charPool = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val password = StringBuilder()

    repeat(LENGTH_TOKEN) {
        password.append(charPool.random().toString())
    }
    return password.toString()
}
