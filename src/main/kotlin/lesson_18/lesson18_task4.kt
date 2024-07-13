package org.example.lesson_18

import kotlin.math.pow

abstract class Box() {
    abstract fun getSurfaceArea(): String
}

class Rectangle(
    private val id: Int,
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Box() {
    companion object {
        private const val PAIR_OF_OPPOSITE_FACES = 2
    }

    override fun getSurfaceArea(): String {
        val surfaceAreaRectangle = PAIR_OF_OPPOSITE_FACES * ((length * width) + (length * height) + (width * height))
        return "To pack this rectangular package with ID: $id," +
                " you will need a package with area: $surfaceAreaRectangle mm."
    }
}

class Cube(
    private val id: Int,
    private val ribLength: Double,
) : Box() {
    companion object {
        private const val CUBE_FACES: Byte = 6
    }

    override fun getSurfaceArea(): String {
        val surfaceAreaCube = CUBE_FACES * ribLength.pow(2)
        return "To pack this cube package with ID: $id, you will need a package with area: $surfaceAreaCube mm."
    }
}

fun main() {

    val box1: Box = Rectangle(1, 16.0, 6.0, 8.0)
    val box2: Box = Cube(2, 4.0)

    val listBoxes = listOf<Box>(box1, box2)
    showTheAreaOfAllBoxes(listBoxes)
}

fun showTheAreaOfAllBoxes(listBoxes: List<Box>) {
    listBoxes.forEach { println(it.getSurfaceArea()) }
}