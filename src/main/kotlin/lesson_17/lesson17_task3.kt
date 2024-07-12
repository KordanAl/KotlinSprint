package org.example.lesson_17

class Folder(
    private val _name: String,
    private var _numberOfFiles: Int,
    private var isSecurity: Boolean = false,
) {
    val name: String
        get() =
            if (isSecurity) {
                "Hidden folder."
            } else {
                _name
            }

    val numberOfFiles: Int
        get() =
            if (isSecurity) {
                0
            } else {
                _numberOfFiles
            }
}

fun main() {
    val folder1 = Folder("KotlinSprint", 85)
    val folder2 = Folder("KotlinHacks", 874354, true)

    println(folder1.name)
    println("Number of files: ${folder1.numberOfFiles}")
    println()
    println(folder2.name)
    println("Number of files: ${folder2.numberOfFiles}")
}
