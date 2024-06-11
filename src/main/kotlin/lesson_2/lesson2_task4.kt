package org.example.lesson_2

const val HUNDRED_PERCENT = 100
fun main () {

    val crystalMaterials = 7
    val ironMaterials = 11
    val buffPercentage = 20

    val bonusCrystalMaterials = (crystalMaterials * buffPercentage / HUNDRED_PERCENT)
    val bonusIronMaterials = (ironMaterials * buffPercentage / HUNDRED_PERCENT)

    println("Бонусные кристаллы: $bonusCrystalMaterials")
    println("Бонусное железо: $bonusIronMaterials")

}