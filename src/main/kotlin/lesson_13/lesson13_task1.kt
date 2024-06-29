package org.example.lesson_13

class ContactPhone(
    val name: String,
    val number: Long,
) {

    var nameCompany: String? = null

    constructor(
        name: String,
        number: Long,
        _nameCompany: String?,
    ) : this(name, number) {
        nameCompany = _nameCompany
    }
}