package org.example.lesson_20

class Player1 {

    private var presenceOfAKey: Boolean = false
    private val goodLuckSearching: IntRange = 0..2

    fun getInfoPresenceOfAKey() = presenceOfAKey

    fun runSearchKey() {
        println("Игрок начал поиск ключа...")

        for (i in 1..100) {
            if (goodLuckSearching.random() == 0) {
                println("Открыл сундук №: $i, увы ключ не найден")
                Thread.sleep(1000)
            } else {
                presenceOfAKey = true
                println("Открыл сундук №: $i, удача сегодня на его стороне, ключ найден!")
                break
            }
        }

    }
}

class Labyrinth {
    var theDoorIsClosed = true
}

fun main() {

    val player1 = Player1()
    val labyrinth = Labyrinth()

    println("Блуждая по лабиринту игрок нашел странную дверь...")

    val openDoor: (Player1) -> Unit = { it: Player1 ->
        if (it.getInfoPresenceOfAKey()) {
            println("Игрок открыл с помощью ключа дверь! Интересно, что ждет его за ее пределами...")
            labyrinth.theDoorIsClosed = false
        } else {
            println("Дверь закрыта, необохдимо найти ключ, чтобы ее открыть!")
        }
    }
    openDoor(player1)
    player1.runSearchKey()
    openDoor(player1)
}