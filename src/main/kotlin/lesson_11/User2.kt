package org.example.lesson_11

class User2(
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {
    fun userDataOutput() {
        println(
            """
            Данные пользователя $login: 
            login: $login
            password: $password
            email: $email
            bio: $bio
            """.trimIndent(),
        )
    }

    fun getBio() {
        println("Введи значение, которые ты хочешь записать в bio: ")
        bio = readln()
        println("Значение bio теперь - $bio.")
    }

    fun changePassword() {
        println("Введите пожалуйста текущий пароль: ")
        var input = ""

        while (input != password) {
            input = readln()
            if (input == password) {
                println("Успешно! Введите пожалуйста новый пароль:")
                val newPassword = readln()
                password = newPassword
                println("Новый пароль успешно изменен!")
                break
            } else {
                println("Пароль введен неверно, повторите попытку: ")
            }
        }
    }
}
