package org.example.lesson_13

class ContactPhone4(
    val name: String,
    val number: String,
    val nameCompany: String? = null,
) {
    override fun toString(): String = "$name, $number, ${nameCompany ?: "не указано"}"
}

fun fromInput(name: String, number: String, nameCompany: String?): ContactPhone4 {
    return try {
        val num = number.toLong()
        ContactPhone4(name, num.toString(), nameCompany)
    } catch (e: Exception) {
        ContactPhone4(name, "ошибка: ${e::class.simpleName}")
    }
}

fun main() {
    val contact = fromInput("Ян", "123ABC", "")
    println(contact)
}