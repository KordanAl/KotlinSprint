package org.example.lesson_20

class Robot {
    private val phrases = listOf(
        "Здесь должен быть текст, но у меня уже нет сил его придумать",
        "Абуди абудай,абуди абудай",
        "Проверь код 7 раз, потом проверь еще раз 100, потом только мержи",
        "Вышел ежик из тумана, вынул ножик из кармана",
        "Если ты упал, значит ты упал (конфуций 99999 лет до н.э)"
    )

    private var modifier: (String) -> String = { it }
    private var isModifierSet: Boolean = false

    fun say() {
        if (isModifierSet) {
            println(modifier(phrases.random()))
        } else {
            println(phrases.random())
        }
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
        isModifierSet = true
    }
}

fun main() {
    val robot = Robot()
    println(
        """
        "Привет, как твои дела?"
        "Я робот Макс и я умею говорить фразы наооборот"
        
    """.trimIndent()
    )

    robot.say()
    robot.setModifier { phrase ->
        phrase.reversed()
    }
    robot.say()
}
