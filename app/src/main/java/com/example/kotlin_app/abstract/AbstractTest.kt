package com.example.kotlin_app.abstract

fun main(args: Array<String>) {
    var car =Car(2020)
    car.speed=200
    car.model=2017
    car.test="Bmw"
    println("Name  : ${car.vehicleName("BMW")}\n" +
            "Type  : ${car.vehicleType("Car")}\n" +
            "Model : ${car.model}\n" +
            "Speed : ${car.speed}\n" +
            "test  : ${car.test}\n")
}