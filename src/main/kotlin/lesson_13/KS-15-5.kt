package org.example.lesson_13

const val MAX_WEIGHT = 2
const val MAX_PASSENGERS = 3
const val MAX_PASSENGERS_CARGO = 1

interface Movable {
    val passengersCount: Int
    fun move() {
        println("Автомобиль выехал и взял с собой $passengersCount пассажиров")
    }
}

interface Loadable {
    fun load(weight: Int)
    fun unload()
}

interface Transporting {
    fun loadPassengers(passengers: Int)
    fun unloadPassengers()
}

class CargoCar(
    val name: String,
) : Movable, Transporting, Loadable {
    override var passengersCount: Int = 0
    override fun loadPassengers(passengers: Int) {
        if (passengers + passengersCount <= MAX_PASSENGERS_CARGO) {
            passengersCount += passengers
        } else {
            println("В автомобиль нельзя погрузить больше $MAX_PASSENGERS_CARGO пассажира")
        }
    }

    var quantityOfWeight: Int = 0
    override fun load(weight: Int) {
        if (quantityOfWeight + weight <= MAX_WEIGHT) {
            quantityOfWeight += weight
        } else {
            println("В автомобиль нельзя погрузить больше $MAX_WEIGHT тон груза")
        }
    }

    override fun unload() {
        quantityOfWeight = 0
    }

    override fun unloadPassengers() {
        passengersCount = 0
    }

    override fun move() {
        println("Автомобиль $name выехал и взял с собой $passengersCount пассажиров и $quantityOfWeight тонн груза")
    }
}

class Sedan(
    val name: String,
) : Movable, Transporting {
    override var passengersCount: Int = 0
    override fun loadPassengers(passengers: Int) {
        if (passengers + passengersCount <= MAX_PASSENGERS) {
            passengersCount += passengers
        } else {
            println("В автомобиль нельзя погрузить больше $MAX_PASSENGERS пассажиров")
        }
    }

    override fun unloadPassengers() {
        passengersCount = 0
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val auto1 = CargoCar("Kamaz")
    val auto2 = Sedan("Toyota")
    val auto3 = Sedan("Mercedes")
    auto1.loadPassengers(1)
    auto2.loadPassengers(3)
    auto3.loadPassengers(2)
    auto1.load(2)
    auto1.move()
    auto2.move()
    auto3.move()
    auto1.unload()
    auto1.unloadPassengers()
    auto1.move()
    auto2.unloadPassengers()
    auto2.move()
    auto3.unloadPassengers()
    auto3.move()
}