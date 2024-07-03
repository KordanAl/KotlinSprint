package org.example.lesson_14

import java.text.NumberFormat
import java.util.*

open class Liner(
    val name: String = "King",
    val speed: Int = 100,
    val liftingCapacity: Int = 1_000_000,
    val passengerCapacity: Int = 100_000,
    val crushIce: Boolean = false,
) {
    fun displayInformation() {
        val numberFormat = NumberFormat.getNumberInstance(Locale.forLanguageTag("ru"))

        println(
            "Информация о корабле: $name " +
                    "\nСкорость: $speed км/ч " +
                    "\nГрузоподъемность: ${numberFormat.format(liftingCapacity)} кг " +
                    "\nВместимость экипажа: ${numberFormat.format(passengerCapacity)} человек " +
                    "\nНаличие ледокола: $crushIce",
        )
    }
}

class Cargo(
    name: String = "Big man",
    speed: Int = 50,
    liftingCapacity: Int = 2_000_000,
    passengerCapacity: Int = 50_000,
) : Liner(name, speed, liftingCapacity, passengerCapacity)

class Icebreaker(
    name: String = "Snowflake",
    speed: Int = 40,
    liftingCapacity: Int = 1_000_000,
    passengerCapacity: Int = 25_000,
    crushIce: Boolean = true,
) : Liner(name, speed, liftingCapacity, passengerCapacity, crushIce)

fun main() {
    val liner = Liner()
    val cargo = Cargo()
    val iceBreaker = Icebreaker()
}
