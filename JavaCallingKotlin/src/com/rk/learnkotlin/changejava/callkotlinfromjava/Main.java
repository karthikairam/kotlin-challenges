package com.rk.learnkotlin.changejava.callkotlinfromjava;

import com.rk.learnkotlin.changejava.kotlincode.Challenge;
import com.rk.learnkotlin.changejava.kotlincode.Employee;
import com.rk.learnkotlin.changejava.kotlincode.KotlinCodeKt;

public class Main {

    public static void main(String[] args) {

        KotlinCodeKt.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(5, 4);
        Challenge.INSTANCE.doMath(5, 4);
        System.out.println(Challenge.INSTANCE.getCounter());

        employee.takesDefault("arg1", "arg2"); //Or We must use @JvmOverloads in the Kotlin class
    }
}
