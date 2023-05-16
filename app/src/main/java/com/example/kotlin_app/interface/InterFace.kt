package com.example.kotlin_app.`interface`

fun main(args: Array<String>) {
    try {
        var vehicles=Vehicles()
//        vehicles.name="Hey"
        vehicles.go();
        vehicles.stop();
        print("vehicles.name ->${vehicles.name}")
    }
    catch (e: ArithmeticException) {
        print(e)
    }

}