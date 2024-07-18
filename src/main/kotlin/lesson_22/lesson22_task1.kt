package org.example.lesson_22

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)

fun main() {
    val user1 = RegularBook("Уличный кот по кличке боб", "Джеймс Боуэен")
    val user2 = RegularBook("Уличный кот по кличке боб", "Джеймс Боуэен")
    val user3 = DataBook("Бойцовский клуб", "Чак Поланик")
    val user4 = DataBook("Бойцовский клуб", "Чак Поланик")

    //false потому, что сравниваются ссылки на обьекты в памяти, а не значения
    println(user1 == user2)
    //true потому, что сравниваются данные обьектов, благодаря Data(данные) классу
    println(user3 == user4)
}


