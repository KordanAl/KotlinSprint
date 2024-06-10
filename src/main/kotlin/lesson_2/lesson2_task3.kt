package org.example.lesson_2

fun main() {
    val timeOfDeparture: String = "9:39"
    val travelTime: Int = 457

    val (hours, minutes) = calculateArrivalTime(timeOfDeparture, travelTime)

    println("Поезд прибудет в $hours:$minutes")
}

fun calculateArrivalTime(timeOfDeparture: String, travelTime: Int): Pair<Int, Int> {
    val (depHours, depMinutes) = timeOfDeparture.split(":").map { it.toInt() }
    val totalMinutes = depHours * 60 + depMinutes + travelTime

    val arrivalHours = totalMinutes / 60
    val arrivalMinutes = totalMinutes % 60

    return Pair(arrivalHours, arrivalMinutes)
}