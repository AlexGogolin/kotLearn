package org.example.lesson_12

open class SpaceObject(
    open val name: String,
    open val hasAtmospheric: Boolean,
    open val hasGround: Boolean,
)

class Planet(
    override val name: String,
    override val hasAtmospheric: Boolean,
    override val hasGround: Boolean,
    val listOfSputnik: List<Sputnik>
) : SpaceObject(name, hasAtmospheric, hasGround)

class Sputnik(
    override val name: String,
    override val hasAtmospheric: Boolean,
    override val hasGround: Boolean,
) : SpaceObject(name, hasAtmospheric, hasGround) {}


fun main() {
    val planet1 = Planet(
        "X-403", hasAtmospheric = true, hasGround = true,
        listOf(
            Sputnik("XM-46", hasAtmospheric = false, hasGround = true),
            Sputnik("YZ-46", hasAtmospheric = false, hasGround = false)
        )
    )
    println("Планета: ${planet1.name} Спутники: ${planet1.listOfSputnik[0].name} и ${planet1.listOfSputnik[1].name}")
}
