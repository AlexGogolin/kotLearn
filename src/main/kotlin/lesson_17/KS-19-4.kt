package org.example.lesson_17

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);

    fun ammoDamage(): Int {
        return damage
    }
}

class Tank(
    val ammo: Ammo? = null,
    var isLoaded: Boolean = false,
) {
    var currentAmmo: Int = 0
    fun reload(ammo: Ammo) {
        currentAmmo = ammo.ammoDamage()
        isLoaded = true
        println("Танк заряжен")
    }

    fun shoot() {
        if (isLoaded) {
            println("Танк выстрелил и нанес ${currentAmmo} урона")
            isLoaded = false
        } else {
            println("Танк не заряжен")
        }
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))

    val t34 = Tank()
    t34.reload(Ammo.GREEN)
    t34.shoot()
    t34.shoot()
    t34.reload(Ammo.BLUE)
    t34.shoot()
    t34.reload(Ammo.RED)
    t34.shoot()
}