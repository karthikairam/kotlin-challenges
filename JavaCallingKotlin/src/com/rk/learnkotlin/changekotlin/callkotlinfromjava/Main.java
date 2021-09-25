package com.rk.learnkotlin.changekotlin.callkotlinfromjava;


import com.rk.learnkotlin.changekotlin.kotlincode.Challenge;
import com.rk.learnkotlin.changekotlin.kotlincode.Employee;
import com.rk.learnkotlin.changekotlin.kotlincode.KotlinStuff;

public class Main {

    public static void main(String[] args) {

        KotlinStuff.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.startYear = 2009;

        Challenge.doMath(5, 4);

        employee.takesDefault("arg1");

        employee.takesDefault(null); // It will through IllegalArgumentException since Kotlin by default all the params as @NotNull
    }
}
