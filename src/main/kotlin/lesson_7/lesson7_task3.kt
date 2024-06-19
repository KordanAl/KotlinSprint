package org.example.lesson_7

fun main() {

    println("Введите число:")
    val number = readln().toInt()

    println("Четные числа от 0 до $number:")
    for (i in 0..number step 2) {
        println(i)
    }
}