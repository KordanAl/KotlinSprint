package org.example.lesson_15

interface Swim {
    fun swim()
}

interface Fly {
    fun fly()
}

class Karas : Swim {
    override fun swim() {
        println("Карась плавает.")
    }
}

class Chaika : Swim, Fly {
    override fun swim() {
        println("Чайка плавает.")
    }

    override fun fly() {
        println("Чайка летает.")
    }
}

class Utka : Swim, Fly {
    override fun swim() {
        println("Утка плавает.")
    }

    override fun fly() {
        println("Утка летает.")
    }
}

fun main() {
    val karas = Karas()
    val chaika = Chaika()
    val utka = Utka()

    karas.swim()

    chaika.swim()
    chaika.fly()

    utka.swim()
    utka.fly()
}