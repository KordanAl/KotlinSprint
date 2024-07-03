package org.example.lesson_13

class ContactPhone4(
    val name: String,
    val number: Long,
    val nameCompany: String? = null,
) {
    companion object {
        fun fromInput(
            name: String,
            number: String,
            nameCompany: String? = null,
        ): ContactPhone4? =
            try {
                ContactPhone4(name, number.toLong(), nameCompany)
            } catch (e: NumberFormatException) {
                println("Ошибка: ${e.message} для контакта '$name'.")
                null
            }
    }

    override fun toString(): String = "$name, $number, ${nameCompany ?: "не указано"}"
}

fun main() {
    val phoneBook =
        mutableListOf(
            ContactPhone4.fromInput("Ростислав", "894552324", "Reddit"),
            ContactPhone4.fromInput("Данила", "89231231231"),
            ContactPhone4.fromInput("Ян", "пусто поле"),
            ContactPhone4.fromInput("Влад", "89456546546", "DNS"),
            ContactPhone4.fromInput("Иван", "89112345678", "Google"),
        )
}
