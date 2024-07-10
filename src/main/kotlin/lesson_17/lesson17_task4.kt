package org.example.lesson_17

class Package(
    val trackingNumber: String,
    private val _currentLocation: String,
) {
    var currentLocation: String = _currentLocation
        set(value) {
            field = value
            movementCount++
        }
    var movementCount: Int = 0
        private set
}

fun main() {
    val pkg = Package("123456789", "China")

    println("Tracking Number: ${pkg.trackingNumber}")
    println("Current Location: ${pkg.currentLocation}")
    println("Movement Count: ${pkg.movementCount}")

    pkg.currentLocation = "Russia"
    println("\nAfter arriving in ${pkg.currentLocation}:")
    println("Current Location: ${pkg.currentLocation}")
    println("Movement Count: ${pkg.movementCount}")

    pkg.currentLocation = "Rostov on Don"
    println("\nAfter arriving in ${pkg.currentLocation}:")
    println("Current Location: ${pkg.currentLocation}")
    println("Movement Count: ${pkg.movementCount}")
}
