package org.example.lesson_14

open class Liner2(
    val name: String = "King",
    val speed: Int = 100,
    val liftingCapacity: Int = 1_000_000,
    val passengerCapacity: Int = 100_000,
    val crushIce: Boolean = false,
) {

    open fun load() {
        println("Лайнер: '$name' - выдвигает горизонтальный трап со шкафута для погрузки.")
    }
}

class Cargo2(
    name: String = "Big man",
    speed: Int = 50,
    liftingCapacity: Int = 2_000_000,
    passengerCapacity: Int = 50_000,
    crushIce: Boolean = false
) : Liner2(name, speed, liftingCapacity, passengerCapacity) {

    override fun load() {
        println("Грузовой корабль: '$name' - активирует погрузочный кран для погрузки.")
    }
}

class Icebreaker2(
    name: String = "Snowflake",
    speed: Int = 40,
    liftingCapacity: Int = 1_000_000,
    passengerCapacity: Int = 25_000,
    crushIce: Boolean = true,
) : Liner2(name, speed, liftingCapacity, passengerCapacity,) {

    override fun load() {
        println("Ледокол: '$name' - открывает ворота со стороны кормы для погрузки.")
    }
}

fun main() {
    val liner = Liner2()
    val cargo = Cargo2()
    val iceBreaker = Icebreaker2()

    liner.load()
    cargo.load()
    iceBreaker.load()
}
