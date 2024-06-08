package org.example.lesson_2

fun main() {

    val studentsInClass: Byte = 4
    val studentsScores = listOf(3, 4, 3, 5)
    val averageScore: Float = studentsScores.sum().toFloat() / studentsInClass

    println(averageScore)

}