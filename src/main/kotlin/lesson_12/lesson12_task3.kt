package org.example.lesson_12

class Weather3(_dayTemp: Int, _nightTemp: Int, _precipitation: Boolean) {

    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var precipitation = _precipitation

    init {
        dayTemp = _dayTemp - 273
        nightTemp = _nightTemp - 273
        precipitation = _precipitation
    }

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