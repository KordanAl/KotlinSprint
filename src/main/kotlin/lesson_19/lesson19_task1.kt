package org.example.lesson_19

enum class FishType {
    GUPPY,
    ANGEL_FISH,
    GOLD_FISH,
    SIAMESE_FIGHTING_FISH
}

fun setFishType(fishType: FishType) {
    when (fishType) {
        FishType.GUPPY -> println("Guppy")
        FishType.ANGEL_FISH -> println("Angel fish")
        FishType.GOLD_FISH -> println("Gold fish")
        FishType.SIAMESE_FIGHTING_FISH -> println("Siamese fighting fish")
    }
}

fun main() {

    val fishInTheAquarium = listOf(1, 2, 3, 4)

    println("Вы можете добавить в свой аквариум следующих рыб:")
    for (i in fishInTheAquarium) {
        when (i) {
            1 -> setFishType(FishType.GUPPY)
            2 -> setFishType(FishType.ANGEL_FISH)
            3 -> setFishType(FishType.GOLD_FISH)
            4 -> setFishType(FishType.SIAMESE_FIGHTING_FISH)
        }
        Thread.sleep(1000)
    }
}