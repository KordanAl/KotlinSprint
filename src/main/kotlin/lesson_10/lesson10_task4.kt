package org.example.lesson_10

fun main() {
    var roundsWon = 0
    var playing = true
    var playerResult: Int
    var computerResult: Int

    println("Давайте поиграем в кости! Кто выбросит большее число, тот и победил.")

    while (playing) {
        playerResult = rollDice()
        computerResult = rollDice()

        println("Вы выбросили: $playerResult \nКомпьютер выбросил: $computerResult")

        if (playerResult > computerResult) {
            println("Победило человечество!")
            roundsWon++
        } else if (computerResult > playerResult)
            println("Победила машина!")
        else
            println("Ничья! Попробуйте еще раз.")

        playing = getPlayRound()
    }
    println("Игра окончена. Вы выиграли рундов: $roundsWon")
}

fun getPlayRound(): Boolean {
    println("Хотите сыграть еще один раунд?")
    val round: String = readln()
    if (round.lowercase() == "да")
        println("Новый раунд!")
    return round.lowercase() == "да"
}

fun rollDice() = (1..6).random()
