package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {
    val timeOfDeparture: String = "9:39"
    val travelTime: Int = 457

    val (hours, minutes) = calculateArrivalTime(timeOfDeparture, travelTime)

    println("Поезд прибудет в $hours:$minutes")
}

fun calculateArrivalTime(timeOfDeparture: String, travelTime: Int): Pair<Int, Int> {
    val (depHours, depMinutes) = timeOfDeparture.split(":").map { it.toInt() }
    val totalMinutes = depHours * MINUTES_IN_HOUR + depMinutes + travelTime

    val arrivalHours = totalMinutes / MINUTES_IN_HOUR
    val arrivalMinutes = totalMinutes % MINUTES_IN_HOUR

    return Pair(arrivalHours, arrivalMinutes)
}