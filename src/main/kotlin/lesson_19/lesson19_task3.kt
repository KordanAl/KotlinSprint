package org.example.lesson_19

class SpaceShip {

    fun takeOff() {
        // TODO: Реализовать логику взлета
        println("Корабль взлетает.")
    }

    fun land() {
        // TODO: Реализовать логику приземления
        println("Корабль приземляется.")
    }

    fun shootAsteroid() {
        // TODO: Реализовать логику отстрела от астероида
        println("Корабль отстреливается от астероида.")
    }

    fun someFutureMethod() {
        TODO("Метод еще не реализован")
    }
}

fun main() {
    val spaceShip = SpaceShip()

    spaceShip.takeOff()
    spaceShip.land()
    spaceShip.shootAsteroid()
    spaceShip.someFutureMethod()
}