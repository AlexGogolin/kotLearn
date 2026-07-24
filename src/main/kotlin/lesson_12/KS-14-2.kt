package org.example.lesson_12

open class Ship2(
    open val name: String,
    open val speed: Int = 50,
    open val quantityOfPassengers: Int = 100,
    open val loadCapacity: Int = 200,
) {
    open fun shipInfo() {
        println("Название корабля: $name Скорость: $speed Количество пассажиров: $quantityOfPassengers Максимальная загрузка: $loadCapacity")
    }

    open fun shipLoad() {
        println("ship load")
    }
}

class Liner2(
    override val name: String,
    override val quantityOfPassengers: Int = 500,
) : Ship2(name, quantityOfPassengers = quantityOfPassengers) {
    override fun shipLoad() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip2(
    override val name: String,
    override val speed: Int = 20,
    override val loadCapacity: Int = 800,
) : Ship2(name, speed, loadCapacity = loadCapacity) {
    override fun shipLoad() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class IceBreaker2(
    override val name: String,
    override val speed: Int = 15,
    override val loadCapacity: Int = 100,
    val hasIceBreaker: Boolean = true,
) : Ship2(name, speed, loadCapacity = loadCapacity) {
    override fun shipInfo() {
        println("Название корабля: $name Скорость: $speed Количество пассажиров: $quantityOfPassengers Максимальная загрузка: $loadCapacity Может колоть лед: $hasIceBreaker")
    }

    override fun shipLoad() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    System.setOut(java.io.PrintStream(System.`out`, true, "UTF-8"))
    val ship1 = Liner2("Anna")
    val ship2 = CargoShip2("Bob")
    val ship3 = IceBreaker2("Billi")
    ship1.shipInfo()
    ship2.shipInfo()
    ship3.shipInfo()
    ship1.shipLoad()
    ship2.shipLoad()
    ship3.shipLoad()

}