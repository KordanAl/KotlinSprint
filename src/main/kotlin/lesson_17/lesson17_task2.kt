package org.example.lesson_17

class Ship(
    private var _name: String,
    private val speed: Int,
    private val homePort: Int,
) {
    var name: String
        get() = _name
        set(value) {
            println("Warning: You cannot change the name of the ship.")
        }
}

fun main() {
    val ship = Ship("Titanic", 50, 21)

    ship.name = "Avrora"
}