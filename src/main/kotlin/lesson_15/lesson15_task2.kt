package org.example.lesson_15

abstract class WeatherStationStats {
    abstract val value: Double

    abstract fun getData(): String
}

class Temperature(
    override val value: Double,
) : WeatherStationStats() {
    override fun getData(): String = "Температура: $value °C"
}

class PrecipitationAmount(
    override val value: Double,
) : WeatherStationStats() {
    override fun getData(): String = "Количество осадков: $value мм"
}

class WeatherServer {
    fun sendDataToServer(data: WeatherStationStats) {
        println(
            when (data) {
                is Temperature -> "Отправка данных о температуре на сервер: ${data.getData()}"
                is PrecipitationAmount -> "Отправка данных о количестве осадков на сервер: ${data.getData()}"
                else -> "Данные указаны неверно!"
            }
        )
    }
}

fun main() {
    val temperature = Temperature(25.3)
    val precipitationAmount = PrecipitationAmount(12.4)
    val server = WeatherServer()

    server.sendDataToServer(temperature)
    server.sendDataToServer(precipitationAmount)
}
