package com.rk.learnkotlin.learnkotlin.challenge1

fun main() {
    //Challenge1.1
    val hello1 = "Hello"
    val hello2 = "Hello"
    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")
    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    //Challenge1.2
    var number = 2988

    //Challenge1.3
    val any: Any = "The Any type is the root of the Kotlin class hierarchy"
    any as String
    println(any.uppercase())

    //Challenge1.4
    println("""   1
        |  11
        | 111
        |1111  
    """.trimMargin())

    println("Challenge1 is completed")
}