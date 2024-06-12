package org.example.lesson_4

fun main() {

    val dayOfTraining = 5

    val armAndAbsExercise = dayOfTraining % 2 != 0
    val legAndBackExercises = dayOfTraining % 2 == 0

    println("""
        Упражнения для рук:    $armAndAbsExercise
        Упражнения для ног:    $legAndBackExercises
        Упражнения для спины:   $legAndBackExercises
        Упражнения для пресса: $armAndAbsExercise
    """.trimIndent())

}