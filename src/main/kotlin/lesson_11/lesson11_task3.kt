package org.example.lesson_11

class Participant(
    val userName: String,
    var status: String,
) {

}

class Rooms(
    val cover: String,
    val name: String,
    val listOfParticipants: MutableList<Participant> = mutableListOf()
) {

    fun addParticipant(participant: Participant) {
        listOfParticipants.add(participant)
    }

    fun updateStatus(userName: String, newStatus: String) {
        val participant = listOfParticipants.find { it.userName == userName }
        participant?.status = newStatus
    }
}

fun main() {
    val room = Rooms(
        cover = "cover.jpg",
        name = "Room1",
        listOfParticipants = mutableListOf(
            Participant(userName = "Danila", status = "разговаривает"),
            Participant(userName = "Maxim", status = "микрофон выключен"),
            Participant(userName = "Vlad", status = "пользователь заглушен")
        )
    )
}