package org.example.lesson_14

class Player(
    val name: String,
    private var health: Int = 100,
    private var damage: Int = 50,
) {
    private var playerDeath: Boolean = false
    fun getDamage(dmg: Int) {
        health -= dmg
        println("$name получил урон в размере $dmg здоровья осталось: $health")
        if (health <= 0) {
            death()
        }
    }

    fun healing(cure: Int) {
        if (!playerDeath) {
            health += cure
            println("$name подлечился на $cure,  здоровья осталось: $health")
        } else {
            println("Мертвеца нельзя полечить")
        }
    }

    private fun death() {
        health = 0
        damage = 0
        playerDeath = true
        println("$name умер!")
    }
}

fun main() {
    val player = Player("Alex")

    player.getDamage(50)
    player.healing(20)
    player.getDamage(120)
}