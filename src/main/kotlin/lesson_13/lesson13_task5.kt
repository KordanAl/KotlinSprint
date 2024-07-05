package org.example.lesson_13

class ContactPhone5(
    val name: String,
    val number: String,
    val nameCompany: String? = null,
) {
    override fun toString(): String = "$name, $number, ${nameCompany ?: "не указано"}"
}
// все перепробовал, не получается
fun fromInput(
    name: String,
    number: String,
    nameCompany: String? = null,
): ContactPhone5 {
    return try {
        val num = number.toLongOrNull() ?
        ContactPhone5(name, num.toString(), nameCompany)
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e::class.simpleName} для контакта '$name'.")
        ContactPhone5(name, "0", nameCompany)
    }
}

fun main() {
    val phoneBook = mutableListOf(
        fromInput("Ростислав", "894552324", "Reddit"),
        fromInput("Данила", "89231231231"),
        fromInput("Ян", ""),
        fromInput("Влад", "89456546546", "DNS"),
        fromInput("Иван", "89112345678", "Google")
    )

    phoneBook.forEach { println(it) }
}