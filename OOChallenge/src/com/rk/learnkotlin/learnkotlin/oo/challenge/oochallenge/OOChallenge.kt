package com.rk.learnkotlin.learnkotlin.oo.challenge.oochallenge

import java.util.function.Consumer

fun main() {
    val bicycle1 = KotlinBicycle(25, 40, 3)
    bicycle1.printDescription()

    val mountainBike1 = KotlinMountainBike(10, 50, 80, 4)
    mountainBike1.printDescription()

    val roadBike1 = KotlinRoadBike(75, 120, 30, 5)
    roadBike1.printDescription()

    //With default gear - we don't give it explicitly
    //The key thing here is, we need to define default for each sub-class even though super class has a default for it
    val bicycle2 = KotlinBicycle(25, 40)
    bicycle2.printDescription()

    val mountainBike2 = KotlinMountainBike(10, 50, 80)
    mountainBike2.printDescription()

    val roadBike2 = KotlinRoadBike(75, 120, 30)
    roadBike2.printDescription()

    //Third challenge
    val mountainBike3 = KotlinMountainBike("blue",10, 50, 80)
    mountainBike2.printDescription()


    //Companion object challenge
    println(KotlinMountainBike.availableColors)
    // or
    KotlinMountainBike.availableColors.forEach { println(it) }
}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 3) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() = println(
        "Bike is in gear $gear with a cadence of $cadence " +
                "travelling at a speed of $speed"
    )
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 4) :
    KotlinBicycle(cadence, gear, speed) {

    var color: String = "red"

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int) :
            this(seatHeight, cadence, speed) {

        this.color = color
        println("The MountainBike has a color of ${this.color}")
    }

    companion object {
        val availableColors: List<String> = listOf("blue", "red", "white", "black", "green", "brown")
    }

    override fun printDescription() {
        super.printDescription()
        println("The MountainBike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(cadence: Int, speed: Int, val tireWidth: Int, gear: Int = 5) :
    KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The RoadBike has a tire Width of $tireWidth MM.")

    }
}
