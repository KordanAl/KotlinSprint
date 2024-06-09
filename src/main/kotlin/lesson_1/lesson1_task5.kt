package org.example.lesson_1

const val SECONDS_IN_SPACE: Int = 5409
const val SECONDS_IN_HOUR: Int = 3600
const val SECONDS_IN_MINUTE: Int = 60

fun main() {

    // Время Юрия Гагарина в космосе

    val hours: Int = SECONDS_IN_SPACE / SECONDS_IN_HOUR
    val minutes: Int = (SECONDS_IN_SPACE % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds: Int = SECONDS_IN_SPACE % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)

}