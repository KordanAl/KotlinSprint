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
    private val truckNumber: Int,
) : Movable,
    PassengerTransport,
    CargoTransport {
    override val maxPassengers: Int = 1

    override val maxCargoWeight: Int = 2
    override var currentCargoWeight: Int = 0

    override fun move() {
        println("Грузовик №$truckNumber движется")
    }

    override fun loadPassengers(count: Int) {
        println("Загружено $count пассажиров в грузовик №$truckNumber.")
    }

    override fun unloadPassengers(count: Int) {
        println("Разгружено $count пассажиров из грузовика №$truckNumber")
    }

    override fun loadCargo(weight: Int) {
        println("Загружено $weight тонн груза в грузовик №$truckNumber")
    }

    override fun unloadCargo(weight: Int) {
        println("Разгружено $weight тонн груза из грузовика №$truckNumber")
    }
}

class Car(
    private val carNumber: Int,
) : Movable,
    PassengerTransport {
    override val maxPassengers: Int = 3

    override fun move() {
        println("Легковая машина №$carNumber движется")
    }

    override fun loadPassengers(count: Int) {
        println("Загружено пассажиров в легковую машину №$carNumber :  $count")
    }

    override fun unloadPassengers(count: Int) {
        println("Разгружено $count пассажиров из легковой машины №$carNumber.")
    }
}

fun main() {
    var passengerSize = 6
    var cargoSize = 2

    val truck = Truck(1)
    val car1 = Car(1)
    val car2 = Car(2)

    println("Необходимо перевести пассажиров: $passengerSize ")
    println("Необходимо перевести тонн груза: $cargoSize ")

    // Загрузка 2 тонн груза и 1 пассажира с движением и последующей разгрузкой

    truck.maxCargoWeight.let {
        val cargoToLoad = if (cargoSize >= it) it else cargoSize
        truck.loadCargo(cargoToLoad)
        cargoSize -= cargoToLoad

        val passengersToLoad = if (passengerSize >= truck.maxPassengers) truck.maxPassengers else passengerSize
        truck.loadPassengers(passengersToLoad)
        passengerSize -= passengersToLoad

        truck.move()
        truck.unloadCargo(cargoToLoad)
        truck.unloadPassengers(passengersToLoad)
    }

    println("Осталость $cargoSize тонн груза для перевозки")
    println("Осталость $passengerSize пассажиров для перевозки \n")

    // Загрузка и разгрузка пассажиров в зависимости он их наличия с движением и разгрузкой

    car1.maxPassengers.let {
        val passengersToLoadCar = if (passengerSize >= it) it else passengerSize
        car1.loadPassengers(passengersToLoadCar)
        passengerSize -= passengersToLoadCar
        car1.move()
        car1.unloadPassengers(passengersToLoadCar)
    }
    println("Осталось пассажиров для перевозки: $passengerSize")

    car2.maxPassengers.let {
        val passengersToLoadCar2 = if (passengerSize >= car2.maxPassengers) car2.maxPassengers else passengerSize
        car2.loadPassengers(passengersToLoadCar2)
        passengerSize -= passengersToLoadCar2
        car2.unloadPassengers(passengersToLoadCar2)
        car2.move()
    }
    println("Осталось пассажиров для перевозки: $passengerSize")
}
