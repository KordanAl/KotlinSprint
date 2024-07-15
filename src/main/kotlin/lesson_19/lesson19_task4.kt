package org.example.lesson_19

enum class TypePatron(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);

    fun getNameTypePatron(): String {
        return when (this) {
            BLUE -> "Синий"
            GREEN -> "Зеленый"
            RED -> "Красный"
        }
    }
}

class Tank(private val name: String) {

    private var currentTypePatron: TypePatron? = null

    fun takeShot() {
        if (currentTypePatron != null) {
            println("$name произвел выстрел и нанес врагу ${currentTypePatron?.damage} урона")
            currentTypePatron = null
            println("$name - орудие разряжено!")
        } else {
            println("$name - орудие не заряжено!\n")
        }
    }

    fun loadPatron(patron: TypePatron) {
        currentTypePatron = patron
        println("$name заряжен патронами типа: ${patron.getNameTypePatron()}")
    }
}

fun main() {

    val tank = Tank("T-34")

    val patrons = listOf(TypePatron.BLUE, TypePatron.GREEN, TypePatron.RED)

    tank.takeShot()

    for (patron in patrons) {
        tank.loadPatron(patron)
        tank.takeShot()
        println()
        Thread.sleep(1000)
    }
}
