package org.example.lesson_3

fun main() {

    var surname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var fullName = "$surname $name $patronymic"
    var age = 20

    println("$fullName, $age лет")

    age = 22
    surname = "Сидорова"
    fullName = "$surname $name $patronymic"

    println("$fullName, $age года")

}