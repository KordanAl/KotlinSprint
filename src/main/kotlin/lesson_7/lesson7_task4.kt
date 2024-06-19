package org.example.lesson_7

fun main() {

    println("Сколько секунд необходимо засечь?")
    val userSeconds: Int = readln().toInt()

    for (i in userSeconds downTo 1) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло.")

}