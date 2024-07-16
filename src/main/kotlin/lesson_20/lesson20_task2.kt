package org.example.lesson_20

class Player(val name: String, var currentHealth: Int, val maxHealth: Int) {

    fun getPlayerInfo() {
        if (currentHealth < maxHealth) {
            println(
                "Игрок '$name' в текущий момент имееет $currentHealth ед. здоровья," +
                        " максимальное значение $maxHealth ед. "
            )
        } else {
            println("Игрок '$name' в текущий момент имееет максимальное здоровье в размере: $maxHealth ед.")
        }
    }
}

fun main() {
    val player = Player("Madrigal", 64, 100)
    player.getPlayerInfo()

    val healingPotion: (Player) -> Player = { it: Player ->
        if (it.currentHealth < it.maxHealth) {
            val heal = it.maxHealth - it.currentHealth
            it.currentHealth = it.maxHealth
            println(
                "Игрок '${it.name}' подобрал зелье лечения и восстановил $heal ед. здоровья!" +
                        " Теперь у него ${it.maxHealth} ед. здоровья."
            )
            Player(it.name, it.currentHealth, it.maxHealth)
        } else {
            println("Игрок '${it.name}' не может подобрать зелье лечения, здоровье в данный момент полное!")
            it
        }
    }
    healingPotion(player)
    player.getPlayerInfo()
}



