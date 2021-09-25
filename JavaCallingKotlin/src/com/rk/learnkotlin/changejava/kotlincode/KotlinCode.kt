package com.rk.learnkotlin.changejava.kotlincode

fun sayHelloToJava(name: String) {
    println("Kotlin says hello to Java and $name")
}

object Challenge {
    var counter: Int = 0;
    fun doMath(x: Int, y: Int): Int {
        counter++
        return (x + y) * (x - y)
    }
}

class Employee(val firstName: String, val lastName: String, var startYear: Int) {

    fun takesDefault(parm1: String, parm2: String = "default") {
        println("$parm1 and $parm2")
    }

}