package org.example.lesson_12

open class Ship(
    open val name: String,
    open val speed: Int = 50,
    open val quantityOfPassengers: Int = 100,
    open val loadCapacity: Int = 200,
)

class Liner(
    override val name: String,
    override val quantityOfPassengers: Int = 500,
) : Ship(name, quantityOfPassengers = quantityOfPassengers)

class CargoShip(
    override val name: String,
    override val speed: Int = 20,
    override val loadCapacity: Int = 800,
) : Ship(name, speed, loadCapacity = loadCapacity)

class IceBreaker(
    override val name: String,
    override val speed: Int = 15,
    override val loadCapacity: Int = 100,
    val hasIceBreaker: Boolean = true,
) : Ship(name, speed, loadCapacity = loadCapacity)

fun main() {

    val liner = Liner("Anna")
    val cargoShip = CargoShip("Bob")
    val iceBreaker = IceBreaker("Lenin")
}