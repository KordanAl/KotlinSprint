package org.example.lesson_10

fun main() {
    println("Введите логин, не менее 4 символов: ")
    val login: String = readln()

    println("Введите пароль, не менее 4 символов): ")
    val password: String = readln()

    if (!validateInput(login) || !validateInput(password)) println("Логин или пароль недостаточно длинные")
    else println("Регистрация успешна! Добро пожаловать!")
}

fun validateInput(input: String) = input.length >= 4