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

    val (name, description, eventDateTime, distanceFromEarth) = alphaCentauri

    println("Название: $name")
    println("Описание: $description")
    println("Дата и время события: $eventDateTime")
    println("Расстояние до земли: $distanceFromEarth световых лет")
}

