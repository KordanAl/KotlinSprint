package org.example.lesson_22

class RegularBook1(val name: String, val author: String)

data class DataBook1(val name: String, val author: String)

fun main() {
    val user1 = RegularBook1("Уличный кот по кличке боб", "Джеймс Боуэен")
    val user2 = DataBook1("Бойцовский клуб", "Чак Поланик")

    //Непонятные символы потому, что в обычном классе так выглядит строковый вывод по умолчанию toString() в принте
    println(user1)
    // В дата классе уже переопределена функция toString() для вывода данных.
    println(user2)
}

