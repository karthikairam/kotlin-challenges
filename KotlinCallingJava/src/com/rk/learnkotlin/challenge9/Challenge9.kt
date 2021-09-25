package com.rk.learnkotlin.challenge9

import com.rk.learnkotlin.javacode.Employee

fun main(args: Array<String>) {

    val employee = Employee("Jane", "Smith", 2000)

    // Make this code compile
    employee.lastName = "Jones"
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56800.42f)

}