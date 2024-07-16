package org.example.lesson_21

import java.io.File
import java.util.*

fun File.writeToLowercaseToBeginning(text: String) {
    val resultText = text.lowercase(Locale.getDefault())
    val originalText = this.readText()

    this.writeText(resultText + "\n" + originalText)
}

fun main() {
    val newTextFile: File = File("NewTextFile.txt")

    newTextFile.createNewFile()
    newTextFile.writeToLowercaseToBeginning("Привет, мир!")
    newTextFile.writeToLowercaseToBeginning("Этот текст будет в начале")

    println(newTextFile.readText())
}

