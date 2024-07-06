package org.example.lesson_13

class ContactPhone4(
    val name: String,
    var number: String,
    val nameCompany: String? = null,
) {
    override fun toString(): String = "$name, $number, ${nameCompany ?: "не указано"}"
}

fun fromInput(contactNumber: String) {
    try {
        contactNumber.toLong()
        println("Номер $contactNumber успешно сохранен!")
    } catch (e: Exception) {
        println("Ошибка: ${e::class.simpleName}")
    }
}

fun main() {
    val contact = ContactPhone4("Ян", "123ABC", null)
    val contact1 = ContactPhone4("Danila", "8913123123", "KotlinSprint")

    fromInput(contact.number)
    fromInput(contact1.number)

}