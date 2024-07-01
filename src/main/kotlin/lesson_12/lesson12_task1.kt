package org.example.lesson_12

class Weather {
    var dayTemp: Int = 10
    var nightTemp: Int = 15
    var precipitation: Boolean = false

    fun printWeather() {
        println("Дневная температура: $dayTemp°C")
        println("Ночная температура: $nightTemp°C")
        println("Наличие осадков: $precipitation")
    }
}

fun main() {

    val weather1 = Weather()
    weather1.dayTemp = 15
    weather1.nightTemp = 8
    weather1.precipitation = true

    val weather2 = Weather()
    weather2.dayTemp = 22
    weather2.nightTemp = 12
    weather2.precipitation = false

    println("Погода в понедельник: ")
    weather1.printWeather()
    println()

    println("Погода во вторник: ")
    weather2.printWeather()
}