package com.example.miprimeraappnativa

class Funciones {
}

fun area() {
    println("ingrese el radio del circulo")
    val r:Int= readln()!!.toInt()
    val dato=3.1415*r*2
    println("el radio es: $r y la area es: $dato")
}

fun perimetro() {
    println("ingrese el diametro")
    val diametro:Int= readln()!!.toInt()
    val dato=3.1415*diametro
    println("el diametro es: $diametro y el parimetro es: $dato")
}

fun areaT(base: Int, altura: Int) {
    val rta=(base*altura)/2

    println("la base es: $base y la altura es: $altura y el area es: $rta")
}

fun perimetroT(lado1:Int,lado2:Int,lado3:Int){
    val rta=lado1+lado2+lado3
    println("el perimetro es: $rta")
}

fun areaR (base:Int,altura: Int):Int{
    val rta=base*altura
    return rta
}

fun perimetroR (base:Int,altura: Int):Int{
    val rta=(base*altura)*2
    return rta
}

fun main() {

    do {
        println("queieres sacar 1:area circulo 2:perimetro circulo 3:area triangulo 4:perimetro triangulo 5:area rectangulo 6:perimetro rectangulo")
        val rta:Int= readln()!!.toInt()
        if (rta == 1){
            area()
        } else if (rta == 2) {
            perimetro()
        } else if (rta ==3) {
            println("ingrese la base")
            val base:Int= readln()!!.toInt()
            println("ingresa la altura")
            val altura:Int= readln()!!.toInt()
            areaT(base,altura)
        } else if (rta == 4){
            println("ingrese el primer lado")
            val lado1:Int= readln()!!.toInt()
            println("ingrese el segundo lado")
            val lado2:Int= readln()!!.toInt()
            println("ingrese el terceer lado")
            val lado3:Int= readln()!!.toInt()
            perimetroT(lado1,lado2,lado3)
        } else if (rta ==5) {
            println("ingrese la base")
            val base:Int= readln()!!.toInt()
            println("ingrese la altura")
            val altura:Int= readln()!!.toInt()
            println(areaR(base,altura))
        } else if (rta == 6) {
            println("ingrese la base")
            val base:Int= readln()!!.toInt()
            println("ingrese la altura")
            val altura:Int= readln()!!.toInt()
            println(perimetroR(base,altura))

        } else{
            println("no hay nunguna operacion disponible con este codigo")
        }

        println("quieres sacar algo mas Y/N")
        val continua=readln()!!.toString().uppercase()
    } while ( continua == "Y")





    /*
    val edad:Int= readln()!!.toInt()
    val evaluator = if (edad >= 18) "vienvenido" else "pa la casa"
    println(evaluator)
    */


}