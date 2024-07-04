package org.example.lesson_13

class ContactPhone2(
    val name: String,
    val number: Long,
    val nameCompany: String? = null,
) {
    companion object {
        fun printUniqueCompanies(contacts: List<ContactPhone2>) {
            contacts
                .mapNotNull { it.nameCompany }
                .distinct()
                .forEach { println(it) }
        }
    }
}

fun main() {
    val phoneBook =
        mutableListOf(
            ContactPhone2("Ростислав", 89123456789, "Reddit"),
            ContactPhone2("Данила", 89231231231),
            ContactPhone2("Ян", 89119876543),
            ContactPhone2("Влад", 89123456788, "null"),
            ContactPhone2("Иван", 89112345678, "Google"),
        )
    ContactPhone2.printUniqueCompanies(phoneBook)
}