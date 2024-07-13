package org.example.lesson_18

abstract class Animal(val name: String) {
    abstract fun eat(): String
    fun sleep(): String = "$name -> sleeps"
}

class Fox(name: String) : Animal(name) {
    override fun eat(): String {
        return "$name -> eats berries"
    }
}

class Dog(name: String) : Animal(name) {
    override fun eat(): String {
        return "$name -> eats bones"
    }
}

class Cat(name: String) : Animal(name) {
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