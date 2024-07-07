package org.example.lesson_15

abstract class UserForum(val userName: String) {
    fun readForum() = println("$userName читает форум.")
    fun writeMessage(message: String) = println("$userName написал сообщение: $message")
}

class SimpleUser(userName: String) : UserForum(userName)

class AdminUser(userName: String) : UserForum(userName) {
    fun deleteMessage(message: String) = println("$userName удалил сообщение: $message")
    fun deleteUser(userName: String) = println("${this.userName} удалил пользователя : $userName")
}

fun main() {
    val user1 = SimpleUser("Danila")
    user1.readForum()
    user1.writeMessage("Java отстой")

    val admin1 = AdminUser("Vadim.admin")
    admin1.readForum()
    admin1.writeMessage("Пожалуйста, соблюдайте правила форума.")
    admin1.deleteMessage("'Java отстой'")
    admin1.deleteUser(user1.userName)
}