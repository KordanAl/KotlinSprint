package org.example.lesson_12

const val KELVIN_TEMPS1 = 273

class Weather4(dayTemp: Int, nightTemp: Int, precipitation: Boolean, day: String) {

    val dayTemp = dayTemp - KELVIN_TEMPS1
    val nightTemp = nightTemp - KELVIN_TEMPS1
    val precipitation = precipitation
    val day = day

    init {
        printWeather4()
    }

    private fun printWeather4() {
        println("Погода в $day: ")
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Наличие осадков: $precipitation")
    }
}

fun main() {

    val weather1 = Weather4(293, 285, false, "понедельник")

}