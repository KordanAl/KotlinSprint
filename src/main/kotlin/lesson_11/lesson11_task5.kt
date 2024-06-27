package org.example.lesson_11

class Forum {
    class ForumUser(
        val userId: Int,
        val userName: String,
    )

    class ForumMessage(
        val authorId: Int,
        val message: String,
    )

    companion object {
        private val users: MutableList<ForumUser> = mutableListOf()
        private val messages: MutableList<ForumMessage> = mutableListOf()
        private var nextUserId: Int = 1

        fun createNewUser(userName: String): ForumUser {
            val newUser = ForumUser(userId = nextUserId++, userName = userName)
            users.add(newUser)
            return newUser
        }

        fun createNewMessage(authorId: Int, message: String): ForumMessage? {
            val userIds = users.map { it.userId }
            return if (authorId in userIds) {
                val newMessage = ForumMessage(authorId, message)
                messages.add(newMessage)
                newMessage
            } else {
                println("Пользователь с идентификатором $authorId не существует.")
                null
            }
        }

        fun printThread() {
            for (message in messages) {
                val author = users.find { it.userId == message.authorId }
                println("${author?.userName}: ${message.message}")
            }
        }
    }
}

fun main() {

    // Создание пользователей
    val user1 = Forum.createNewUser(userName = "Данила")
    val user2 = Forum.createNewUser(userName = "Влад")

    Forum.createNewMessage(user1.userId, message = "Привет, меня зовут Данила!")
    Forum.createNewMessage(user1.userId, message = "Как ваши Дела?")
    Forum.createNewMessage(user2.userId, message = "Привет, Данила, меня зовут Влад!")
    Forum.createNewMessage(user2.userId, message = "У меня все хорошо, а у тебя как?")

    Forum.printThread()
}