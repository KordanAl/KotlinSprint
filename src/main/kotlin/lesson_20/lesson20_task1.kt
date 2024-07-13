package org.example.lesson_20

fun main() {

    val splashScreen: (String) -> String = { username: String ->
        "С наступающим Новым Годом, $username!"
    }
    val username = splashScreen("Иван")
    println(username)
}

