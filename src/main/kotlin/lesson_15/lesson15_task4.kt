package org.example.lesson_15

interface Searchable {
    fun search()
}

abstract class Product(val name: String, val quantityInStock: Int) : Searchable

class Instrument(name: String, quantityInStock: Int) : Product(name, quantityInStock) {
    override fun search() {
        println("Выполняется поиск комплектующих для инструмента $name")
        for (i in 1..3) {
            println(i)
            Thread.sleep(1000)
        }
        println("Найдены следующие комплектующие ....")
    }
}

class Accessory(name: String, quantityInStock: Int) : Product(name, quantityInStock) {
    override fun search() {
        TODO("Not yet implemented")
    }

}

fun main() {
    val guitar = Instrument("Гитара", 10)

    val guitarStrings = Accessory("Струны для гитары", 50)

    guitar.search()
}