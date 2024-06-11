package org.example.lesson_4

const val NUMBER_OF_TABLES: Byte = 13

fun main() {

    val reservedTablesForToday = 13
    val reservedTablesForTomorrow = 9

    val freeTablesForToday: Boolean = reservedTablesForToday < NUMBER_OF_TABLES
    val freeTablesForTomorrow: Boolean = reservedTablesForTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $freeTablesForToday \nДоступность столиков на завтра: $freeTablesForTomorrow")

}