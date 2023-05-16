package com.example.kotlin_app

fun main(args: Array<String>) {
//    arrayList()
    set()
//    var name= arrayOf(1,234,"hello")
//    println(name[2])
//    name.set(2,true)
//    println(name[2])
}

fun arrayList(){
    var age = ArrayList<Int>();
    var year = arrayListOf<Int>(2022,2023,2,3,5)
    year.add(10);
    year.remove(2022)
    println(year[0])
}
fun set(){
    var day = setOf<Int>(1,2,4,6,1,1,1,1)
    println(day.size)
    println(day)

}