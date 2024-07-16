package org.example.lesson_21

class Player1(val name: String, var currentHealth: Int, val maxHealth: Int)

fun main() {
    val player1 = Player1("Madrigal", 45, 100)
    println("Сейчас у игрока максимальное здоровье? ${player1.isHealthy()}")
}

fun Player1.isHealthy(): Boolean = currentHealth == maxHealth
