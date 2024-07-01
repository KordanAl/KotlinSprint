package org.example.lesson_13

class ContactPhone1(
    private val name: String,
    private val number: Long,
    private val nameCompany: String? = null
) {
    init {
        println()
        println("$name, $number, ${nameCompany ?: "не указано"}")
        println()
    }
}

fun main() {

    val contact1 = ContactPhone1("Ростислав", 89123456789, "Reddit")
    val contact2 = ContactPhone1("Данила", 89231231231)
}