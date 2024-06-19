package org.example.lesson_8

fun main() {

    val viewsPerDay = intArrayOf(1500, 2000, 1800, 2200, 1900, 2100, 1700)
    val totalViewsWeek: Int = viewsPerDay.sum()

    println("Общее количество просмотров за неделю: $totalViewsWeek")

}