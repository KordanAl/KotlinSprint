package org.example.lesson_22

data class MainScreenState(
    val data: String = "отуствуют",
    val isLoading: Boolean = false,
) {
    override fun toString(): String {
        return if (!isLoading) {
            "Текущее состояние:[данные: $data, состояние загрузки: $isLoading]\n"
        } else {
            "Текущее состояние:[данные: в процессе загрузки, состояние загрузки: $isLoading]\n"
        }
    }
}

class MainScreenViewModel {

    var mainScreenState = MainScreenState()

    fun loadData() {
        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Загрузка данных...")
        print(mainScreenState)
        Thread.sleep(3000)

        val loadedData = "Погода сегодня: 28° тепла"
        mainScreenState = mainScreenState.copy(data = loadedData, isLoading = false)
        println("Загруженны данные: $loadedData \n")
    }

}

fun main() {
    val viewModel = MainScreenViewModel()

    // Состояние: отсутствие данных
    println(viewModel.mainScreenState)

    // Загрузка данных
    viewModel.loadData()

    // Состояние: данные загружены
    println(viewModel.mainScreenState)
}