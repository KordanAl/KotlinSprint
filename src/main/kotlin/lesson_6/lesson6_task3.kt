package org.example.lesson_6

fun main() {

    println("Сколько секунд необходимо засечь?")
    var userSeconds: Int = readln().toInt()

    val originalSeconds = userSeconds

    while (userSeconds > 0) {
        println("Осталось секунд: ${userSeconds--}")
        Thread.sleep(1000)
    }
    println("Время вышло")

}
