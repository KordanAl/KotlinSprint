package org.example.lesson_21

// функция возвращает первое максимальное значение найденное в мапе, если их больше 1, она все равно вернет только одно
fun Map<String, Int>.maxCategory(): String? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Огненный выстрел" to 150,
        "Огненный шар" to 300,
        "Метеорит" to 300
    )
    println("Самое прокаченно умение у героя: ${skills.maxCategory()}")
}
