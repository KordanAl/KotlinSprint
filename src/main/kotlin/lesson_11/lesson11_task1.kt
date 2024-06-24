package org.example.lesson_11

class User(
    val login: String,
    val password: String,
    val email: String,
) {

}

fun main() {

    val user1 = User(
        login = "Kotlin",
        password = "KotlinClass",
        email = "Kotlin.gmail.com"
    )

    val user2 = User(
        login = "Java",
        password = "JavaClass",
        email = "Java.gmail.com"
    )

    println(user1.login)
    println(user1.password)
    println(user1.email)

    println()

    println(user2.login)
    println(user2.password)
    println(user2.email)
}