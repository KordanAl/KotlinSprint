package org.example.lesson_22

data class Car(val name: String, val speed: Int, val year: Int)

fun main() {

    val car1 = Car("Aston Martin", 280, 2005)

    val (name, speed, year) = car1

    println("Марка авто: $name, скорость: $speed, год выпуска: $year")
}

