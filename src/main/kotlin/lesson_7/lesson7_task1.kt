package org.example.lesson_7

const val PASSWORD_LENGTH = 6

fun main() {

    val letters: CharRange = 'a'..'z'
    val numbers: IntRange = 0..9
    val password = StringBuilder()

    for (i in 0 until PASSWORD_LENGTH) {
        if (i % 2 == 0) {
            password.append(letters.random())
        } else {
            password.append(numbers.random())
        }
    }
    println(password)

}