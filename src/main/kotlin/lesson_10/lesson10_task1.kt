package org.example.lesson_10

fun main() {
    val playerResult: Int = rollDice1()
    val computerResult: Int = rollDice1()
    println(
        """
        Давайте поиграем в кости! Кто выбросит большее число, тот и победил.
        Вы выбросили: $playerResult
        Компьютер выбросил: $computerResult
    """.trimIndent()
    )

    when {
        playerResult > computerResult -> println("Победило человечество!")
        computerResult > playerResult -> println("Победила машина!")
        else -> println("Ничья! Попробуйте еще раз.")
    }
}

fun rollDice1() = (1..6).random()