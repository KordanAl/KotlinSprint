package org.example.lesson_1

fun main() {

    // Решение задачи №5

    // Время Юрия Гагарина в космосе

    val secondsInSpace: Int = 5409
    val hours: Int = secondsInSpace / 3600
    val minutes: Int = (secondsInSpace % 3600) / 60
    val seconds: Byte = 9
    println("0$hours:$minutes:0$seconds")

}