package org.example.lesson_17

class UserData1(
    private val _login: String,
    private val _password: String,
) {

    var login = _login
        set(value) {
            field = value
            println("The login change is successful! New login: $value")
        }
    var password: String
        get() = "*".repeat(_password.length)
        set(value) {
            println("You cannot change the password!")
        }
}

fun main() {
    val user1 = UserData1("Danila", "KotlinSprinter124")

    println("Current user login: ${user1.login}")
    user1.login = "Ivan"

    println("Current user password: ${user1.password}")
    user1.password = "ZASDaqweqwdqw1234"
}
