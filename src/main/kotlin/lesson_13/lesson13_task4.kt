package org.example.lesson_13

class ContactPhone3(
    private val name: String,
    private val number: Long,
    private val nameCompany: String? = null,
) {
    companion object {
        fun fromInput(name: String, numberInput: String, nameCompany: String? = null): ContactPhone3? {
            if (numberInput.isBlank()) {
                println("Не введен номер для контакта '$name'.")
                return null
            }

            val number = numberInput.toLongOrNull()
            return if (number != null) {
                ContactPhone3(name, number, nameCompany)
            } else {
                println("Неверный номер для контакта '$name'.")
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
        ContactPhone3.fromInput("Ростислав", "894552324", "Reddit"),
        ContactPhone3.fromInput("Данила", "89231231231"),
        ContactPhone3.fromInput("Ян", ""),
        ContactPhone3.fromInput("Влад", "89456546546", "null"),
        ContactPhone3.fromInput("Иван", "89112345678", "Google")
    )
}