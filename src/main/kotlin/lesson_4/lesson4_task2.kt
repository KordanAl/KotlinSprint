package org.example.lesson_4

const val MIN_WEIGHT_KG: Byte = 35
const val MAX_WEIGHT_KG: Byte = 100
const val MAX_VOLUME_LITER:Byte = 100

fun main () {

    val oneCargoKg = 20
    val oneCargoLiter = 80

    val twoCargoKg = 50
    val twoCargoLiter = 100

    val oneAverageCargo = (MIN_WEIGHT_KG > oneCargoKg) && (oneCargoKg <=  MAX_WEIGHT_KG) && oneCargoLiter < MAX_VOLUME_LITER
    val twoAverageCargo = (MIN_WEIGHT_KG > twoCargoKg) && (twoCargoKg <=  MAX_WEIGHT_KG) && twoCargoLiter < MAX_VOLUME_LITER

    println("Груз с весом $oneCargoKg кг и объемом $oneCargoLiter л соответствует категории 'Average': $oneAverageCargo")
    println("Груз с весом $twoCargoKg кг и объемом $twoCargoLiter л соответствует категории 'Average': $twoAverageCargo")

}