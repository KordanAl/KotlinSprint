package org.example.lesson_2

fun main() {

    val companyEmployees = 50
    val employeeSalaryRub = 30000

    val companyInterns = 30
    val companySalaryRub = 20000

    val employeeSalaryExpenseRub = companyEmployees * employeeSalaryRub // Расходы на выплату зп постоянных сотрудников
    val totalSalaryExpensesRub = employeeSalaryExpenseRub + (companyInterns * companySalaryRub) // Общие расходы на зп ( включая стажеров )
    val averageEmployeeSalaryRub = (employeeSalaryRub + companySalaryRub) / 2 // Средняя зп сотрудника с учетом стажеров

    println(employeeSalaryExpenseRub)
    println(totalSalaryExpensesRub)
    println(averageEmployeeSalaryRub)

}