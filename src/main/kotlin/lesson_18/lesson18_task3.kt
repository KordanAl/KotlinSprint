package org.example.lesson_18

open class Animal() {
    open fun eat(): String = ""
}

class Fox(private val name: String, private val food: String) : Animal() {
    override fun eat(): String {
        return "$name -> eats $food"
    }
}

class Dog(private val name: String, private val food: String) : Animal() {
    override fun eat(): String {
        return "$name -> eats $food"
    }
}

class Cat(private val name: String, private val food: String) : Animal() {
    override fun eat(): String {
        return "$name -> eats $food"
    }
}

fun main() {
    val fox: Animal = Fox("Foxy", "berries")
    val dog: Animal = Dog("Baby", "bones")
    val cat: Animal = Cat("Shukaku", "fish")

    val animalList: List<Animal> = listOf(fox, dog, cat)
    showAllAnimal(animalList)
}

fun showAllAnimal(animals: List<Animal>) {
    animals.forEach { println(it.eat()) }
}
