package com.example.kotlin_app.`interface`

class Vehicles : CanGo ,Stop{


    override fun stop() {
      print("We stop")
    }

    override var name: String
        get()="BMW"
        set(name:String) {
            this.name=name;
        }
}