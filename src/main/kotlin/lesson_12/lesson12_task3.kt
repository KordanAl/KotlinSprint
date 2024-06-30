package org.example.lesson_12

const val KELVIN_TEMPS = 273

class Weather3(dayTemp: Int, nightTemp: Int, precipitation: Boolean) {

    var dayTemp = dayTemp - KELVIN_TEMPS
    var nightTemp = nightTemp - KELVIN_TEMPS
    var precipitation = precipitation

    fun printWeather3() {
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Наличие осадков: $precipitation")
    }
}

fun main() {

    val weather1 = Weather3(293, 285, false)

    println("Погода в понедельник: ")
    weather1.printWeather3()

}