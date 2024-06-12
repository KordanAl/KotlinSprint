package org.example.lesson_4

// Критерии благоприятных условий включают:

const val SUNNY_WEATHER = true
const val OPEN_TENT = true
const val AIR_HUMIDITY_PERCENTAGE: Int = 20
const val CURRENT_TIME_OF_YEAR: String = "not winter"

fun main() {

    // Условия сегодня

    val sunnyWeatherNow: Boolean = true
    val openTentForNow: Boolean = true
    val airHumidityNowPercentage: Int = 20
    val currentTimeOfYearNow = "winter"

    val favorableConditions = listOf (SUNNY_WEATHER, OPEN_TENT, SUNNY_WEATHER, CURRENT_TIME_OF_YEAR)
    val conditionsToday = listOf(sunnyWeatherNow, openTentForNow, airHumidityNowPercentage, currentTimeOfYearNow)

    println("Благоприятные ли условия сейчас для роста бобовых? ${conditionsToday == favorableConditions}")

}