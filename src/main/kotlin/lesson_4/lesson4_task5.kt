package org.example.lesson_4

const val CASE_DAMAGE: String = "false"
const val FAVORABLE_CONDITIONS: String = "true"
const val BOXES_OF_PROVISIONS: Int = 50
const val MIN_CREWS: Int = 50
const val MAX_CREWS: Int = 70

fun main() {

    val сaseCondition = getCaseCondition()
    val сrewComposition = getCrewComposition()
    val boxesOfProvisionsOnBoard = getBoxesOfProvisionsOnBoard()
    val weather = getWeather()

    if ((сaseCondition == CASE_DAMAGE) &&
        (сrewComposition in MIN_CREWS..MAX_CREWS) &&
        (boxesOfProvisionsOnBoard > BOXES_OF_PROVISIONS) &&
        (weather == FAVORABLE_CONDITIONS)
    ) {
        println("Корабль может отправится в плаванье")
    } else if ((сaseCondition != CASE_DAMAGE) &&
        (сrewComposition == MAX_CREWS) &&
        (boxesOfProvisionsOnBoard >= BOXES_OF_PROVISIONS) &&
        (weather == FAVORABLE_CONDITIONS)
    ) {
        println("Корабль может отправится в плаванье")
    } else {
        println("Корабль не может отправится в плаванье")
    }

}

fun getCaseCondition(): String {
    println("Наличие повреждений корпуса: true or false")
    return readln()

}

fun getCrewComposition(): Int {
    println("Tекущий состав экипажа:")
    return readln().toInt()

}

fun getBoxesOfProvisionsOnBoard(): Int {
    println("Количество ящиков с провизией на борту:")
    return readln().toInt()

}

fun getWeather(): String {
    println("Благоприятность метеоусловий: true or false")
    return readln()

}