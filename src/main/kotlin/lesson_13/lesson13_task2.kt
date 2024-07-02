package org.example.lesson_13

class ContactPhone1(
    val name: String,
    val number: Long,
    val nameCompany: String?
) {
    fun getDisplayContactInfo() {
        println("$name, $number, ${nameCompany ?: "не указано"}")
    }
}

fun main() {

    val contact1 = ContactPhone1("Ростислав", 89123456789, "Reddit")
    val contact2 = ContactPhone1("Данила", 89231231231, null)

    contact1.getDisplayContactInfo()
    contact2.getDisplayContactInfo()
}