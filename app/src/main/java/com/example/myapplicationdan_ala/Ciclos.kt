package com.example.myapplicationdan_ala

class Ciclos {
}

fun main() {

    /*
    //recorido a la inversa

    for (i in 5 downTo 1) print(i)
    println()
    //recorido normal

    for (i in 5 downTo 1) print(i)
    println()
    //realiza un salto entre numeros

    for (i in 1 .. 5 step 2) print(i)
    */
    /*
    var j :Int=0
    var f :Int=0
    var sump:Int=0
    var sumi:Int=0
    for (i in 1..6) {
        println("ingrese un nimero")
        var num1:Int= readLine()!!.toInt()

        if (num1 % 2 === 0){
            println("el numero dijitado ($num1) es par")
            j+=1
            sump=num1+sump
        }else {
            println("el numero dijitado ($num1) es inpar")
            f+=1
            sumi=sumi+num1
        }
    }
    println("as piesto numeros pares $j veses")
    println("as piesto numeros inpares $f veses")
    println("la suma de los pares es: $sump")
    println("la suma de los inpares es: $sumi")
    */

    /*
    var i:String="Y"
    var j :Int=0
    var f :Int=0
    var sump:Int=0
    var sumi:Int=0

    while (i == "Y"){
        println("ingrese un numero")
        var num1:Int= readLine()!!.toInt()

        if (num1 % 2 === 0){
            println("el numero dijitado ($num1) es par")
            j+=1
            sump=num1+sump
        }else {
            println("el numero dijitado ($num1) es inpar")
            f += 1
            sumi = sumi + num1
        }
        println("deseas continuar Y/N")
        i= readLine()!!.toString()
    }
    println("as piesto numeros pares $j veses")
    println("as piesto numeros inpares $f veses")
    println("la suma de los pares es: $sump")
    println("la suma de los inpares es: $sumi")
    */

    var i:String
    var j :Int=0
    var f :Int=0
    var sump:Int=0
    var sumi:Int=0

    do {
        println("ingrese un numero")
        var num1:Int= readLine()!!.toInt()

        if (num1 % 2 === 0){
            println("el numero dijitado ($num1) es par")
            j+=1
            sump=num1+sump
        }else {
            println("el numero dijitado ($num1) es inpar")
            f += 1
            sumi = sumi + num1
        }
        println("deseas continuar Y/N")
        i= readLine()!!.toString()
    }while (i == "Y")

    println("as piesto numeros pares $j veses")
    println("as piesto numeros inpares $f veses")
    println("la suma de los pares es: $sump")
    println("la suma de los inpares es: $sumi")
}