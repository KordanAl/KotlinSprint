package org.example.lesson_3

fun main() {

    var fromWhere: String = "E2"
    var where: String = "E4"
    var moveNumber: Int = 1

    var figureAction: String = "[$fromWhere-$where;$moveNumber]"

    println(figureAction)

    fromWhere = "D2"
    moveNumber = +1

    val currentPosition: Char = fromWhere[0]
    val nextLineNumber: Int = fromWhere.substring(1).toInt() + moveNumber
    val nextPosition: String = "$currentPosition$nextLineNumber"

    println("[$fromWhere-$nextPosition;$moveNumber]")

}