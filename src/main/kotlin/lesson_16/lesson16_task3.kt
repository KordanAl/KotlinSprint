package org.example.lesson_16

class UserData(private val login: String, private val password: String) {

    fun enterPassword(): String {
        println("$login you need to enter password for verification:")
        return readln()
    }

    fun getValidatePassword(enteredPassword: String): Boolean = (enteredPassword == password)
}

fun main() {
    val user = UserData("DanilaKotlinSprinter", "Encapsulation123")
    val enterUserPassword = user.enterPassword()

    println(
        if (user.getValidatePassword(enterUserPassword)) {
            "The password is correct!"
        } else {
            "The password is not correct!"
        }
    )
}