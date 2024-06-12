package org.example.lesson_4

const val MINIMUM_WEIGHT_KG: Byte = 35
const val MAXIMUM_WEIGHT_KG: Byte = 100
const val MAXIMUM_VOLUME_LITER:Byte = 100

fun main () {

    val oneCargoKg = 20
    val oneCargoLiter = 80

    val twoCargoKg = 50
    val twoCargoLiter = 100

    println("Груз с весом $oneCargoKg кг и объемом $oneCargoLiter л соответствует категории 'Average': ${(MINIMUM_WEIGHT_KG > oneCargoKg) && (oneCargoKg <=  MAXIMUM_WEIGHT_KG) && oneCargoLiter < MAXIMUM_VOLUME_LITER}")
    println("Груз с весом $twoCargoKg кг и объемом $twoCargoLiter л соответствует категории 'Average': ${(MINIMUM_WEIGHT_KG > twoCargoKg) && (twoCargoKg <=  MAXIMUM_WEIGHT_KG) && twoCargoLiter < MAXIMUM_VOLUME_LITER}")

}