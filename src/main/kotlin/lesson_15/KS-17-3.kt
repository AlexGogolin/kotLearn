package org.example.lesson_15

class Package(
    val name: String,
    val quantityOfFiles: Int,
    var topSecret: Boolean = true,
) {
    val getInfo: String
        get() = if (!topSecret) "$name Файлов: $quantityOfFiles" else "Cкрытая папка, количество файлов: 0"
}

fun main() {
    val file = Package("Zone51", 62)
    println(file.getInfo)
    file.topSecret = false
    println(file.getInfo)
}