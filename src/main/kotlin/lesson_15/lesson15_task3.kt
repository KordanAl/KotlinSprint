package org.example.lesson_15

abstract class ForumUser {

    abstract val name: String
    abstract val adminPrivilege: Boolean
    abstract val text: String
    abstract fun loginToTheForum()
    abstract fun wright()
    abstract fun read()

}

class SimpleUser(
    override val name: String,
    override val adminPrivilege: Boolean = false,
    override val text: String = ""
) : ForumUser() {
    override fun loginToTheForum() {
        println("Вошел на форум")
    }

    override fun wright() {
        println("$name напечатал сообщение: $text")
    }

    override fun read() {
        println("$name: читает...")
    }
}

class AdminUser(
    override val name: String,
    override val adminPrivilege: Boolean = true,
    override val text: String = ""
) : ForumUser() {
    override fun loginToTheForum() {
        println("Вошел на форум")
    }

    override fun wright() {
        println("$name напечатал сообщение: $text")
    }

    override fun read() {
        println("$name читает...")
    }

    fun deleteMessage(text: String) {
        println("Удалил сообщение: $text")
    }

    fun deleteUser(name: String) {
        println("Удалил пользователя: $name")
    }
}

fun main() {

    val user = SimpleUser("Данила", text = "Подскажите пожалуйста, как вывести список в консоль")
    val user1 = SimpleUser("ПсевдоГуру", text = "Нужно нажать alt + f4")

    var userA = AdminUser("Георгий")

    user.wright()
    user1.wright()
    user.read()
    userA.read()
    userA.deleteMessage(user1.text)
    userA.deleteUser(user1.name)

    userA = AdminUser("Георгий", text = "Не слушай его, я сейчас тебе все расскажу!")

    userA.wright()
}