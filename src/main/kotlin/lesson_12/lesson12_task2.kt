package org.example.lesson_12

class Weather2(val dayTemp: Int, val nightTemp: Int, val precipitation: Boolean) {

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