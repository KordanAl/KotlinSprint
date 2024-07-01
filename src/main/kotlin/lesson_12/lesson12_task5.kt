package org.example.lesson_12

const val KELVIN_TEMPS2 = 273

class Weather5(
    dayTemp: Int,
    nightTemp: Int,
    precipitation: Boolean,
    day: Int,
) {
    val dayTemp = dayTemp - KELVIN_TEMPS2
    val nightTemp = nightTemp - KELVIN_TEMPS2
    val hasPrecipitation = precipitation
    val day = day

    init {
        printWeather5()
    }

    private fun printWeather5() {
        println("Погода в $day день Июня: ")
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Наличие осадков: $hasPrecipitation")
        println()
    }
}

fun main() {
    val daysInMonth = 1..30
    val temperatureRange = 263..323
    val presenceOfPrecipitation = 0..1

    val weatherList = daysInMonth.map { day ->
        Weather5(
            dayTemp = temperatureRange.random(),
            nightTemp = temperatureRange.random(),
            precipitation = presenceOfPrecipitation.random() == 1,
            day = day
        )
    }.toMutableList()

    val averageDayTemp = weatherList.map { it.dayTemp }.average().toInt()
    val averageNightTemp = weatherList.map { it.nightTemp }.average().toInt()
    val daysWithPrecipitationCount = weatherList.map { it.hasPrecipitation }.count { it }

    println("Средняя дневная температура в Июне: ${averageDayTemp}°C")
    println("Средняя ночная температура в Июне: ${averageNightTemp}°C")
    println("Дней с осадками в Июне: $daysWithPrecipitationCount")
}
