package org.example.lesson_12

const val KELVIN_TEMP = 273

class Weather5(
    _dayTemp: Int,
    _nightTemp: Int,
    _precipitation: Boolean,
    _day: Int,
) {
    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var precipitation = _precipitation
    var day = _day

    init {
        dayTemp = _dayTemp - KELVIN_TEMP
        nightTemp = _nightTemp - KELVIN_TEMP
        precipitation = _precipitation
        day = _day
        printWeather5()
    }

    private fun printWeather5() {
        println("Погода в $day день Июня: ")
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Наличие осадков: $precipitation")
        println()
    }
}

fun main() {
    val weatherList = mutableListOf<Weather5>()
    val dayTemps = mutableListOf<Int>()
    val nightTemps = mutableListOf<Int>()
    val daysWithPrecipitation = mutableListOf<Boolean>()

    val daysInMonth = 1..30
    val temperatureRange = 263..323
    val boolean = 0..1

    var dayTemp: Int
    var nightTemp: Int
    var precipitation: Boolean

    for (day in daysInMonth) {
        dayTemp = temperatureRange.random()
        nightTemp = temperatureRange.random()
        precipitation = boolean.random() == 1

        dayTemps.add(dayTemp)
        nightTemps.add(nightTemp)
        daysWithPrecipitation.add(precipitation)
        weatherList.add(Weather5(dayTemp, nightTemp, precipitation, day))
    }

    val averageTemp = ((dayTemps + nightTemps).average() - KELVIN_TEMP).toInt()
    println("Средняя температура в Июне $averageTemp °C")

    val trueCount = daysWithPrecipitation.count { it }
    println("Дней с осадками в Июне: $trueCount")
}
