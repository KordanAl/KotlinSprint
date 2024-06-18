package org.example.lesson_6

const val MILLISECONDS: Long = 1000L

fun main() {

    println("Сколько секунд необходимо засечь?")

    val userSeconds: Int = readln().toInt()
    Thread.sleep(userSeconds * MILLISECONDS)

    println("Прошло $userSeconds секунд")

}
