package org.example.lesson_13

import java.util.*

class ContactPhone3(
    val name: String,
    val number: Long,
    val nameCompany: String? = null,
) {
    override fun toString(): String = "Контакт: ($name, $number, $nameCompany)"

    fun getContactInfo(): ContactPhone3? {
        println("Введите имя контакта:")
        val name = readln()

        println("Введите номер контакта: ")
        val number = readln().toLongOrNull()

        if (number == null) {
            println("Номер телефона не был введен или неверен. Контакт не будет добавлен.")
            return null
        }

        println("Введите название компании: ")
        val nameCompany = readln()

        return ContactPhone3(name, number, nameCompany.ifBlank { null })
    }
}

fun main() {
    val contactList = mutableListOf<ContactPhone3>()

    while (true) {
        val contact = getContactInfo()
        if (contact != null) {
            contactList.add(contact)
        }

        println("Хотите добавить еще один контакт? (да/нет)")
        val addNewContact = readln()
        if (addNewContact.lowercase(Locale.getDefault()) == "нет") break
    }
    contactList.forEach { println(it) }
}


fun getContactInfo(): ContactPhone3? {
    println("Введите имя контакта:")
    val name = readln()

    println("Введите номер контакта: ")
    val number = readln().toLongOrNull()

    if (number == null) {
        println("Номер телефона не был введен или неверен. Контакт не будет добавлен.")
        return null
    }

    println("Введите название компании: ")
    val nameCompany = readln()

    return ContactPhone3(name, number, nameCompany.ifBlank { null })
}
