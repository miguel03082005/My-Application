package com.example.myapplicationdan_ala

class Introduccion {
}

/*fun main() {
    println("Hello World")
}*/


//Variables: val(constant) and var(it's mutable)

fun main() {
    var name:String="Dan"
    var distance:Long=7545612454575
    var age: Int= 17
    var sec: Short = 946
    var hour: Byte=24

    var double:Double = 2.95
    var float:Float=454.5f
    var char:Char='7'
    var boolean:Boolean = true

    //print(distance)

    //Colon Notation:
    var width: Int = 12
    var length: Double = 2.5

    val s = "Daniel"
    println("$s.length is ${s.length}")


    var num1:Int = 501
    var num2:Int = 502
    var r = num1+num2

    //print("The sum between $num1 and $num2 is: $r \t")

    //readLine() method
    //var lastName = readLine()
    //var result:Int = readLine()!!.toInt()

    print("Ingrese el número 1: ")
    var numberOne:Int= readLine()!!.toInt()
    print("Ingrese el número 2: ")
    var numberTwo:Int = readLine()!!.toInt()
    var sum = numberOne+numberTwo
    print("The sum between $numberOne and $numberTwo is: $sum")


    //Null variable
    var nup:Long?=null

}