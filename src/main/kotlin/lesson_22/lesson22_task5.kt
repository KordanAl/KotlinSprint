package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDateTime: String,
    val distanceFromEarth: Double,
) {
    override fun toString(): String {
        return "Название: $name\n" +
                "Описание: $description\n" +
                "Дата и время события: $eventDateTime\n" +
                "Расстояние до земли: $distanceFromEarth световых лет"
    }
}

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Альфа Центавра",
        description = "Верхняя кульминация звезды.",
        eventDateTime = "Ежегодно происходит в полночь 24 апреля или в 21:00 8 июня",
        distanceFromEarth = 4.367
    )
    println(alphaCentauri)
}

