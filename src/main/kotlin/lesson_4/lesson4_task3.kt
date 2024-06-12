package org.example.lesson_4

// Критерии благоприятных условий включают:

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY_PERCENTAGE: Int = 20

fun main() {

    // Условия сегодня

    val sunnyWeatherNow: Boolean = true
    val openTentForNow: Boolean = true
    val airHumidityNowPercentage: Int = 20
    val currentTimeOfYearNow = "winter"

    val favorableConditions: Boolean = (sunnyWeatherNow == IS_SUNNY)
            && (openTentForNow == IS_AWNING_OPEN)
            && (airHumidityNowPercentage == AIR_HUMIDITY_PERCENTAGE)
            && (currentTimeOfYearNow != "winter")
    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")

}