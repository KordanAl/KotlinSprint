package org.example.lesson_16

const val NEW_STATUS: String = "Completed"
const val APPLICATION_ACCEPTED: String = "status approved"
const val APPLICATION_NOT_ACCEPTED: String = "status rejected"

class Order(
    private val orderNumber: Int,
    private var orderStatus: String,
) {
    fun getCurrentOrderStatus() = "Current order status: '$orderStatus'"

    fun getNewOrderStatus(
        newStatus: String,
        confirm: String,
    ) {
        if (confirm == APPLICATION_ACCEPTED) orderStatus = newStatus
    }
}

fun main() {
    val order1 = Order(1, "On the road")
    println(order1.getCurrentOrderStatus())

    val applicationToTheManager = sendRequestToTheManager(NEW_STATUS, order1.getCurrentOrderStatus())
    println(applicationToTheManager)

    order1.getNewOrderStatus(NEW_STATUS, applicationToTheManager)
    println(order1.getCurrentOrderStatus())
}

fun sendRequestToTheManager(
    newStatus: String,
    orderStatus: String,
): String {
    println("An application has been sent to the manager to change status.\n")

    println(
        "Hello, it is necessary to change the status of the order from '$orderStatus' to '$newStatus'," +
                " since the client requested that the order has already been received.",
    )
    println("Do you confirm the changes? yes or no")

    val manager: String = readln()

    val managerDecision =
        if (manager == "yes") {
            APPLICATION_ACCEPTED
        } else {
            APPLICATION_NOT_ACCEPTED
        }
    return managerDecision
}
