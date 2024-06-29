package org.example.lesson_12

class Weather4(_dayTemp: Int, _nightTemp: Int, _precipitation: Boolean, _day: String) {

    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var precipitation = _precipitation
    var day = _day

    init {
        dayTemp = _dayTemp - 273
        nightTemp = _nightTemp - 273
        precipitation = _precipitation
        day = _day
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

    val weather1 = Weather4(293, 285, false, "Понедельник")

}