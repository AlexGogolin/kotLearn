package org.example.lesson_15

class Package(
    name: String,
    quantityOfFiles: Int,
    var topSecret: Boolean = true,
) {
    val getName: String = name
        get() = if (topSecret) "Скрытая папка" else field
    val getQuantityOfFiles: Int = quantityOfFiles
        get() = if (topSecret) 0 else field
}

fun main() {
    val file = Package("Zone51", 62)
    println("Имя папки ${file.getName} Количество файлов: ${file.getQuantityOfFiles}")
    file.topSecret = false
    println("Имя папки ${file.getName} Количество файлов: ${file.getQuantityOfFiles}")
}