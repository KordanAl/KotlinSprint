package org.example.lesson_12

class Weather2(_dayTemp: Int, _nightTemp: Int, _precipitation: Boolean) {
    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var precipitation = _precipitation

    fun printWeather1() {
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Наличие осадков: $precipitation")
    }
}

fun main() {

    val weather1 = Weather2(10, 15, false)

    println("Погода в понедельник: ")
    weather1.printWeather1()

}