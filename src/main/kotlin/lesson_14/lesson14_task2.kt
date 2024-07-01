package org.example.lesson_14

import java.text.NumberFormat
import java.util.*

open class Liner2(
    val name: String = "King",
    val speed: Int = 100,
    val liftingCapacity: Int = 1_000_000,
    val passengerCapacity: Int = 100_000,
    val loadingMethod: String = "выдвигает горизонтальный трап со шкафута",
    val crushIce: Boolean = false,

) {
    fun displayInformation2() {
        val numberFormat = NumberFormat.getNumberInstance(Locale.forLanguageTag("ru"))

        println("Информация о корабле: $name")
        println("Скорость: $speed км/ч")
        println("Грузоподъемность: ${numberFormat.format(liftingCapacity)} кг")
        println("Вместимость экипажа: ${numberFormat.format(passengerCapacity)} человек")
        println("Способ погрузки: $loadingMethod")
        if (crushIce) println("В наличии имеется: 'Ледокол' ")
        println()
    }
}

class Cargo2(
    name: String = "Big man",
    speed: Int = 50,
    liftingCapacity: Int = 2_000_000,
    passengerCapacity: Int = 50_000,
    loadingMethod: String = "активирует погрузочный кран",
) : Liner2(name, speed, liftingCapacity, passengerCapacity, loadingMethod)

class Icebreaker2(
    name: String = "Snowflake",
    speed: Int = 40,
    liftingCapacity: Int = 1_000_000,
    passengerCapacity: Int = 25_000,
    loadingMethod: String = "открывает ворота со стороны кормы",
    crushIce: Boolean = true,
) : Liner2(name, speed, liftingCapacity, passengerCapacity, loadingMethod, crushIce)


fun main() {

    val liner = Liner2()
    val cargo = Cargo2()
    val iceBreaker = Icebreaker2()

    liner.displayInformation2()
    cargo.displayInformation2()
    iceBreaker.displayInformation2()

}