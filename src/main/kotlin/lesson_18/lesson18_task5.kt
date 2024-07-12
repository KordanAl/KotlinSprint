package org.example.lesson_18

open class Figure {
    open fun draw() = ""
}

class Circle<T : Number>(
    private val x: T,
    private val y: T,
) : Figure() {
    override fun draw(): String {
        return "Рисуем круг с координатами ($x, $y)"
    }
}

class Square<T : Number>(
    private val x: T,
    private val y: T,
) : Figure() {
    override fun draw(): String {
        return "Рисуем квадрат с координатами ($x, $y)"
    }
}

class Point<T : Number>(
    private val x: T,
    private val y: T,
) : Figure() {
    override fun draw(): String {
        return "Рисуем точку с координатами ($x, $y)"
    }
}

class Screen {
    fun showAllFiguresDraw(figures: List<Figure>) {
        figures.forEach { println(it.draw()) }
    }
}

fun main() {
    val circle: Figure = Circle(10.5f, 20)
    val square: Figure = Square(15.5, 25.5)
    val point: Figure = Point(5, 5)

    val screen = Screen()

    val listFigures = listOf(circle, square, point)
    screen.showAllFiguresDraw(listFigures)
}