package org.example.lesson_4

const val CASE_NO_DAMAGE = "true"
const val FAVORABLE_CONDITIONS = "true"

fun main() {

    val сaseCondition = getCaseCondition()
    val сrewComposition = getCrewComposition()
    val boxesOfProvisionsOnBoard = getBoxesOfProvisionsOnBoard()
    val wather = getWeather()

    if((сaseCondition == CASE_NO_DAMAGE || сaseCondition != CASE_NO_DAMAGE )
        && (сrewComposition in 55..70)
        && (boxesOfProvisionsOnBoard!! > 50)
        && (wather == FAVORABLE_CONDITIONS) ) {
        println("Корабль может отправится в плаванье")
    } else {
        println("Корабль не может отправится в плаванье")
    }

}

fun getCaseCondition () : String? {
    println("Наличие повреждений корпуса: true or false")
    return readLine()

}

fun getCrewComposition () : Int? {
    println("Tекущий состав экипажа:")
    return readLine()?.toInt()

}

fun getBoxesOfProvisionsOnBoard () : Int? {
    println("Количество ящиков с провизией на борту:")
    return readLine()?.toInt()

}

fun getWeather () : String? {
    println("Благоприятность метеоусловий: true or false")
    return readLine()

}