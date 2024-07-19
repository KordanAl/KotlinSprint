package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: String,
    val distanceFromEarth: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Верхняя кульминация звезды.",
        eventDateTime = "Ежегодно происходит в полночь 24 апреля или в 21:00 8 июня",
        distanceFromEarth = 4.367
    )

    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата и время события: ${alphaCentauri.component3()}")
    println("Расстояние до земли: ${alphaCentauri.component4()} световых лет")
}

