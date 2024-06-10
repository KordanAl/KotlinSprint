package org.example.lesson_2

import kotlin.math.pow

fun main () {

    val depositAmount: Int = 70_000
    val depositYear: Byte = 20
    val interestRate: Double = 16.7

    val totalDepositAmount = depositAmount * (1 + interestRate / 100).pow(depositYear.toDouble())
    val formatedTotalDepositAmount: String = String.format("%.3f", totalDepositAmount)

    println(formatedTotalDepositAmount)

}