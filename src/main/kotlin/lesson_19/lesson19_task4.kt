package org.example.lesson_19

enum class TypePatron {
    BLUE,
    GREEN,
    RED;

    fun getDamageTypePatron(): Int {
        return when (this) {
            BLUE -> 5
            GREEN -> 10
            RED -> 20
        }
    }

    fun getNameTypePatron(): String {
        return when (this) {
            BLUE -> "Синий"
            GREEN -> "Зеленый"
            RED -> "Красный"
        }
    }
}

class Tank(private val name: String) {

    fun takeShot(patron: TypePatron) {
        println("$name произвел выстрел и нанес врагу ${patron.getDamageTypePatron()} урона")
    }

    fun runLoadNewPatron(patron: TypePatron) {
        println("$name воорудил орудие типом патронов: ${patron.getNameTypePatron()}")
    }
}

fun main() {

    val tank = Tank("T-34")

    val patrons = listOf(TypePatron.BLUE, TypePatron.GREEN, TypePatron.RED)

    for (patron in patrons) {
        tank.runLoadNewPatron(patron)
        tank.takeShot(patron)
        Thread.sleep(1000)

    }
}
