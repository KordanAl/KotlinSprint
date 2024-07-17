package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return this.count { it in vowels }
}

fun main() {
    val testString = "hello"
    println("Количество глассных букв в слове '$testString': ${testString.vowelCount()}")
}

