package org.example.lesson_18

abstract class Animal() {
    abstract val name: String

    abstract fun eat(): String

    fun sleep(): String = "$name -> sleeps"
}

class Fox(override val name: String) : Animal() {
    override fun eat(): String {
        return "$name -> eats berries"
    }
}

class Dog(override val name: String) : Animal() {
    override fun eat(): String {
        return "$name -> eats bones"
    }
}

class Cat(override val name: String) : Animal() {
    override fun eat(): String {
        return "$name -> eats fish"
    }
}

fun main() {
    val fox: Animal = Fox("Foxy")
    val dog: Animal = Dog("Baby")
    val cat: Animal = Cat("Shukaku")

    val animalList: List<Animal> = listOf(fox, dog, cat)
    showAllAnimals(animalList)
}

fun showAllAnimals(animals: List<Animal>) {
    animals.forEach {
        println(it.eat())
        println(it.sleep())
    }
}