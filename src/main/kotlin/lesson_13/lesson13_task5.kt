package org.example.lesson_13

class ContactPhone4(
    private val name: String,
    private val number: Long,
    private val nameCompany: String? = null
) {
    companion object {
        fun fromInput(name: String, numberInput: String, nameCompany: String? = null): ContactPhone4? {
            val number = numberInput.toLongOrNull()
            return if (number != null) {
                ContactPhone4(name, number, nameCompany)
            } else {
                println("Ошибка: NumberFormatException для контакта '$name'.")
                null
            }
        }
    }

    init {
        println(toString())
    }

    override fun toString(): String {
        return "$name, $number, ${nameCompany ?: "null"}"
    }
}

fun main() {
    val phoneBook = mutableListOf(
        ContactPhone4.fromInput("Ростислав", "894552324", "Reddit"),
        ContactPhone4.fromInput("Данила", "89231231231"),
        ContactPhone4.fromInput("Ян", "это мой номер"),
        ContactPhone4.fromInput("Влад", "89456546546", "null"),
        ContactPhone4.fromInput("Иван", "89112345678", "Google")
    )
}