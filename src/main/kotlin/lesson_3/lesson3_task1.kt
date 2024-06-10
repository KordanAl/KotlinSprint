package org.example.lesson_3

fun main() {

    val userName = "Danila"
    var time = 12

    val greetingDependingOnTime: String = when (time) {

        in 5..11 -> "Доброе утро, $userName!"

        in 12..16 -> "Добрый день, $userName!"

        in 17..22 -> "Добрый вечер, $userName!"

        else -> "Доброй ночи, $userName!"

    }
    println(greetingDependingOnTime)

    time = 21

    val newGreetingDependingOnTime: String = when (time) {

        in 5..11 -> "Доброе утро, $userName!"

        in 12..16 -> "Добрый день, $userName!"

        in 17..22 -> "Добрый вечер, $userName!"

        else -> "Доброй ночи, $userName!"

    }
    println(newGreetingDependingOnTime)
}
