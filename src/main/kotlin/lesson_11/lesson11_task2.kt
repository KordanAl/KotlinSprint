package org.example.lesson_11

fun main() {

    val user = User2(
        login = "userOne",
        password = "userOne123456",
        email = "userOne.gmail.com",
        bio = "-"
    )

    user.userDataOutput()
    user.getBio()
    println()
    user.changePassword()

    val userDanila = User2(
        login = "DankorAL",
        password = "DankorALaroknad",
        email = "DankorAL.gmail.com",
        bio = "eyes"
    )

    println()
    println("Пользователь: ${userDanila.login}")
    userDanila.changePassword()
    println()
    userDanila.userDataOutput()
}



