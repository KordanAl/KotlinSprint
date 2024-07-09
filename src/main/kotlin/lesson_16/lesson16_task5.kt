package org.example.lesson_16

class Player(
    private val name: String,
    private var health: Int,
    private var hitPower: Int,
) {
    private val maxHealth = health
    private var death = false

    fun getName() = name
    fun getDeathInfo() = death

    fun currentHealth() {
        println("Player's current health: $health \n")
    }

    fun getDamage(damage: Int) {
        if ((health - damage > 0) && !death) {
            println("The player received $damage units of damage.")
            health -= damage
            currentHealth()
        } else {
            println("The hero cannot take damage.")
            getDeath()
        }
    }

// Метод принимат лечение и отрабатывает так, чтобы лечение не превышало здоровье
    fun getHealing(healing: Int) {
        val maxHealing = maxHealth - health
        if (!death) {
            if (healing + health > maxHealth) {
                health += maxHealing
                println("Player received $maxHealing healing units.")
            } else {
                health += healing
                println("Player received $healing healing units.")
            }
            currentHealth()
        } else {
            println("Healing is not possible, the player is dead!")
        }
    }

    private fun getDeath() {
        println("The player is dead!")
        health = 0
        hitPower = 0
        death = true
    }
}

class Monster(val name: String, val damage: IntRange)

fun main() {
    val player = Player("Danila", 100, 10_000)
    val monster = Monster("Minotaur", 10..50)

    val heroHealing = 10..50

    println("The player: ${player.getName()} met a ${monster.name} on his way and was noticed by the enemy, the battle begins!")
    player.currentHealth()

    while (!player.getDeathInfo()) {
        player.getDamage(monster.damage.random())
        Thread.sleep(1500)

        player.getHealing(heroHealing.random())
        Thread.sleep(1500)
    }
}
