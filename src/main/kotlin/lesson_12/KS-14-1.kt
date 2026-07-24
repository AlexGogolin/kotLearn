package org.example.lesson_12

open class Ship(
    val name: String,
    val speed: Int = 50,
    val quantityOfPassengers: Int = 100,
    val loadCapacity: Int = 200,
)

class Liner(
    name: String,
    quantityOfPassengers: Int = 500,
    ) : Ship(name, quantityOfPassengers = quantityOfPassengers)

class CargoShip(
    name: String,
    speed: Int = 20,
    loadCapacity: Int = 800,
) : Ship(name, speed, loadCapacity = loadCapacity)

class IceBreaker(
    name: String,
    speed: Int  = 15,
    loadCapacity: Int = 100,
    hasIceBreaker: Boolean = true,
) : Ship(name, speed, loadCapacity = loadCapacity)