package org.example.lesson_15

class Banderol(
    val Id: Int,
    place: String,
) {
    var counter: Int = 0

    var packageLocation: String = place
        set(value) {
            if (field != value) {
                counter++
                field = value
            }
        }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val anyPackage = Banderol(1, "Madrid")
    println("Посылка находится в ${anyPackage.packageLocation}, она перемещалась ${anyPackage.counter} раз")

    anyPackage.packageLocation = "Pekin"

    println("Посылка находится в ${anyPackage.packageLocation}, она перемещалась ${anyPackage.counter} раз")
}