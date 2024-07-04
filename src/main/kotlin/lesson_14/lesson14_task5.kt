package org.example.lesson_14


open class Message(val id: Int, val text: String, val author: String) {
    open fun printMessage(indentLevel: Int = 0) {
        val indent = " ".repeat(indentLevel * 4)
        println("$indent[$author]: $text")
    }
}

class ChildMessage(id: Int, text: String, author: String, val parentMessageId: Int) : Message(id, text, author) {
    override fun printMessage(indentLevel: Int) {
        super.printMessage(indentLevel + 1)
    }
}

class Chat {
    private val messages = mutableListOf<Message>()
    private var nextId = 1

    fun addMessage(text: String, author: String) {
        messages.add(Message(nextId++, text, author))
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        if (messages.any { it.id == parentMessageId }) {
            messages.add(ChildMessage(nextId++, text, author, parentMessageId))
        } else {
            println("Родительское сообщение с идентификатором $parentMessageId не найдено.")
        }
    }

    fun printChat() {
        val childMessagesMap = messages.filterIsInstance<ChildMessage>()
            .groupBy { it.parentMessageId }

        messages.filterNot { it is ChildMessage }
            .forEach { parent ->
                parent.printMessage()
                childMessagesMap[parent.id]?.forEach { child ->
                    child.printMessage(1)
                }
            }
    }
}

fun main() {
    val chat = Chat()
    chat.addMessage("Привет всем!", "Данила")
    chat.addMessage("Привет, Данила!", "Влад")
    chat.addThreadMessage("Привет, как твои дела?", "Иван", 1)
    chat.addThreadMessage("У меня все отлично, спасибо!", "Данила", 2)
    chat.addMessage("С возвращением!", "Сергей")

    chat.printChat()
}