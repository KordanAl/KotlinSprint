package org.example.lesson_15

interface Movable {
    fun move()
}

interface PassengerTransport {
    val maxPassengers: Int

    fun loadPassengers(count: Int)

    fun unloadPassengers(count: Int)
}

interface CargoTransport {
    val maxCargoWeight: Int
    var currentCargoWeight: Int

    fun loadCargo(weight: Int)

    fun unloadCargo(weight: Int)
}

class Truck(

) : Movable,
    PassengerTransport,
    CargoTransport {
    override val maxPassengers: Int = 1

    override val maxCargoWeight: Int = 2
    override var currentCargoWeight: Int = 0

    override fun move() {
        println("Грузовик движется")
    }

    override fun loadPassengers(count: Int) {
        println("Загружено $count пассажиров в грузовик.")
    }

    override fun unloadPassengers(count: Int) {
        println("Разгружено $count пассажиров из грузовика.")
    }

    override fun loadCargo(weight: Int) {
        println("Загружено $weight тонн груза в грузовик.")
    }

    override fun unloadCargo(weight: Int) {
        println("Разгружено $weight тонн груза из грузовика.")
    }
}

class Car(
    private val carNumber: Int,
) : Movable, PassengerTransport {
    override val maxPassengers: Int = 3

    override fun move() {
        println("Легковая машина №$carNumber движется")
    }

    override fun loadPassengers(count: Int) {
        println("Загружено $count пассажиров в легковую машину №$carNumber.")
    }

    override fun unloadPassengers(count: Int) {
        println("Разгружено $count пассажиров из легковой машины №$carNumber.")
    }
}

fun main() {
    var passengerSize = 6
    val cargoSize = 2

    val truck = Truck()
    val car1 = Car(1)
    val car2 = Car(2)

    println("Необходимо перевезти пассажиров: $passengerSize")
    println("Необходимо перевезти тонн груза: $cargoSize")

    val (remainingPassengers, remainingCargo) = loadAndMoveCargoTransport(truck, passengerSize, cargoSize)

    println("Осталось $remainingCargo тонн груза для перевозки")
    println("Осталось $remainingPassengers пассажиров для перевозки \n")

    passengerSize = loadAndMovePassengerTransport(car1, remainingPassengers)
    println("Осталось пассажиров для перевозки: $passengerSize")

    passengerSize = loadAndMovePassengerTransport(car2, passengerSize)
    println("Осталось пассажиров для перевозки: $passengerSize")
}

fun loadAndMovePassengerTransport(car: Car, passengerSize: Int): Int {
    val passengersToLoad = if (passengerSize >= car.maxPassengers) {
        car.maxPassengers
    } else {
        passengerSize
    }
    car.loadPassengers(passengersToLoad)
    car.move()
    car.unloadPassengers(passengersToLoad)
    return passengerSize - passengersToLoad
}

fun loadAndMoveCargoTransport(truck: Truck, passengerSize: Int, cargoSize: Int): Pair<Int, Int> {
    val cargoToLoad = if (cargoSize >= truck.maxCargoWeight) {
        truck.maxCargoWeight
    } else {
        cargoSize
    }
    truck.loadCargo(cargoToLoad)

    val passengersToLoad = if (passengerSize >= truck.maxPassengers) {
        truck.maxPassengers
    } else {
        passengerSize
    }
    truck.loadPassengers(passengersToLoad)
    truck.move()
    truck.unloadCargo(cargoToLoad)
    truck.unloadPassengers(passengersToLoad)

    return Pair(passengerSize - passengersToLoad, cargoSize - cargoToLoad)
}