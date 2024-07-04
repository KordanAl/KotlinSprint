package org.example.lesson_14

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(
    val color: String,
) {
    abstract fun getSquare(): Double
    abstract fun getPerimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun getSquare(): Double = PI * radius.pow(2)
    override fun getPerimeter(): Double = 2 * PI * radius
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun getSquare(): Double = width * height
    override fun getPerimeter(): Double = 2 * (width + height)
}

fun main() {
    val listFigures =
        listOf<Figure>(
            Circle("white", 5.0),
            Circle("black", 3.0),
            Rectangle("white", 12.0, 6.0),
            Rectangle("black", 22.0, 16.0),
        )

    val sumPOfBlackPieces: Double = listFigures.filter { it.color == "black" }.sumOf { it.getPerimeter() }
    val sumSOfWhitePieces: Double = listFigures.filter { it.color == "white" }.sumOf { it.getSquare() }

    println("Сумма периметров всех черных фигур: ${sumPOfBlackPieces.toInt()} мм")
    println("Сумма площадей всех белых фигур: ${sumSOfWhitePieces.toInt()} мм")
}