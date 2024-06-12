package org.example.lesson_4

fun main() {

    val dayOfTraining = 5

    val isEven: (Int) -> Boolean = { dayOfTraining % 2 == 0 }

    println("""
        Упражнения для рук:    ${!isEven(dayOfTraining)}
        Упражнения для ног:    ${isEven(dayOfTraining)}
        Упражнения для спины:   ${isEven(dayOfTraining)}
        Упражнения для пресса: ${!isEven(dayOfTraining)}
    """.trimIndent())

}