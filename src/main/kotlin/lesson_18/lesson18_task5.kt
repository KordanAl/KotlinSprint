package org.example.lesson_18

class Circle
class Square
class Point

class Screen {
    fun draw(x: Int, y: Int, figure: Circle) {
        println("Рисуем круг с координатами ($x, $y)")
    }

    fun draw(x: Float, y: Float, figure: Circle) {
        println("Рисуем круг с координатами ($x, $y)")
    }

    fun draw(x: Int, y: Int, figure: Square) {
        println("Рисуем квадрат с координатами ($x, $y)")
    }

    fun draw(x: Float, y: Float, figure: Square) {
        println("Рисуем квадрат с координатами ($x, $y)")
    }

    fun draw(x: Int, y: Int, figure: Point) {
        println("Рисуем точку с координатами ($x, $y)")
    }

    fun draw(x: Float, y: Float, figure: Point) {
        println("Рисуем точку с координатами ($x, $y)")
    }
}

fun main() {
    val screen = Screen()

    screen.draw(10.5f, 20.0f, Circle())
    screen.draw(15.5f, 25.5f, Square())
    screen.draw(5, 5, Point())
}