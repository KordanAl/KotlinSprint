package org.example.lesson_14

abstract class CelestialBodies(
    val name: String,
    val atmosphere: Boolean,
    val suitabilityForLanding: Boolean,
) {

}

class Planet(
    name: String,
    private val listSatellites: MutableList<Satellite> = mutableListOf(),
    atmosphere: Boolean,
    suitabilityForLanding: Boolean,
) : CelestialBodies(name, atmosphere, suitabilityForLanding) {

    fun addSatellite(it: Satellite) = listSatellites.add(it)

    fun getSatellitesNames(): String = listSatellites.joinToString(", ") { it.name }
}

class Satellite(
    name: String,
    atmosphere: Boolean = true,
    suitabilityForLanding: Boolean,
) : CelestialBodies(name, atmosphere, suitabilityForLanding) {

}

fun main() {

    val planetEarth = Planet("Земля", atmosphere = true, suitabilityForLanding = true)

    val satelliteMoon = Satellite("Луна", atmosphere = false, suitabilityForLanding = true)
    val satellitePhobos = Satellite("Фобос", atmosphere = false, suitabilityForLanding = false)

    planetEarth.addSatellite(satelliteMoon)
    planetEarth.addSatellite(satellitePhobos)

    println("У планеты ${planetEarth.name} есть спутники: ${planetEarth.getSatellitesNames()}.")
}

