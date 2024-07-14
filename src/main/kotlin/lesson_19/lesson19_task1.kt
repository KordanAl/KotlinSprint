package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGEL_FISH,
    GOLD_FISH,
    SIAMESE_FIGHTING_FISH
}

fun printlnInformationAboutAvailableFish() {
    println("Вы можете добавить в свой аквариум следующих рыб: ${Fish.entries.joinToString()}")
}



fun main() {
   printlnInformationAboutAvailableFish()
}