package org.example.lesson_16

import kotlin.math.pow

private const val PI: Double = 3.14

class Circle(private val radius: Double) {

    fun getAreaOfCircle(): Double = PI * radius.pow(2)

    fun getCircumference(): Double = 2 * PI * radius
}

fun main() {
    val circle = Circle(12.0)

    println("The circumference is: ${circle.getCircumference()} mm")
    println("The area of the circle is ${circle.getAreaOfCircle()} mm")
}