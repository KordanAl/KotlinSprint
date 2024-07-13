package org.example.lesson_19

private const val MAXIMUM_INPUT: Byte = 5

enum class Gender {
    MALE,
    FEMALE;

    fun getNameGender(): String {
        return when (this) {
            MALE -> "Мужской"
            FEMALE -> "Женский"
        }
    }
}

class Human(val name: String, val gender: Gender)

fun main() {

    println(
        """
        Добро пожаловать в приложение 'Картотека'!
        Пожалуйста, введите имя и пол человека.
        Формат ввода: имя,пол (например: Иван, Мужской)
    """.trimIndent()
    )

    val humanList = mutableListOf<Human>()
    var humanInput: String

    while (humanList.size < MAXIMUM_INPUT) {
        println("Введите данные человека (${humanList.size + 1}/$MAXIMUM_INPUT):")
        humanInput = readln()
        if (humanInput.contains(",")) {
            val parts = humanInput.split(",")
            if (parts.size == 2) {
                val name = parts[0].trim().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
                val genderInput = parts[1].trim().uppercase()

                val gender = when (genderInput) {
                    "МУЖСКОЙ" -> Gender.MALE
                    "ЖЕНСКИЙ" -> Gender.FEMALE
                    else -> null
                }

                if (gender != null) {
                    humanList.add(Human(name, gender))
                } else {
                    println("Некорректный ввод пола. Пожалуйста, используйте 'Мужской' или 'Женский'.")
                }
            } else {
                println("Некорректный формат ввода. Пожалуйста, используйте формат: имя,пол")
            }
        } else {
            println("Некорректный формат ввода. Пожалуйста, используйте формат: имя,пол")
        }
    }

    println("\nСписок людей в картотеке:")
    for (human in humanList) {
        println("Имя: ${human.name}, Пол: ${human.gender.getNameGender()}")
    }
}
