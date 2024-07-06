package org.example.lesson_15

interface Searchable {
    fun searchAccessory()
}

abstract class Product(
    val name: String,
    val quantityInStock: Int,
)

class Instrument(
    name: String,
    quantityInStock: Int,
    val accessoryList: List<Accessory>,
) : Product(name, quantityInStock),
    Searchable {
    override fun searchAccessory() {
        println("Выполняется поиск комплектующих для инструмента $name")
        for (i in 1..3) {
            println(i)
            Thread.sleep(1000)
        }
        if (accessoryList.isEmpty()) {
            println("Комплектующие не найдены.")
        } else {
            println("Найдены следующие комплектующие:")
            for (accessory in accessoryList) {
                println("- ${accessory.name}, в наличии: ${accessory.quantityInStock}")
            }
        }
    }
}

class Accessory(
    name: String,
    quantityInStock: Int,
) : Product(name, quantityInStock)

fun main() {
    val guitarStrings = Accessory("Струны для гитары", 50)
    val guitarPick = Accessory("Медиатор", 100)

    val guitarAccessory = Instrument("Гитара", 10, listOf(guitarStrings, guitarPick))

    guitarAccessory.searchAccessory()
}