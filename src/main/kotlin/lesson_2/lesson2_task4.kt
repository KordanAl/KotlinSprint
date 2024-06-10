package org.example.lesson_2

fun main () {

    val crystalMaterials = 7
    val ironMaterials = 11
    val buffPercentage = 20

    val bonusCrystalMaterials = (crystalMaterials * buffPercentage / 100)
    val bonusIronMaterials = (ironMaterials * buffPercentage / 100)

    println("Бонусные кристаллы: $bonusCrystalMaterials")
    println("Бонусное железо: $bonusIronMaterials")

}