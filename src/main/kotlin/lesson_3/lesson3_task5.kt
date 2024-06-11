package org.example.lesson_3

fun main () {

    val figureAction: String = "D2-D4;0"

    val figureActionList = figureAction.split("-", ";")

    val fromWhere = figureActionList[0]
    val where = figureActionList[1]
    val moveNumber = figureActionList[2]

    println(fromWhere)
    println(where)
    println(moveNumber)

}
