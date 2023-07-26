package com.example.myapplicationdan_ala

class Reto2 {
}

fun main() {
    var i:String
    var total:Int=0

    println("Bienvenido a supermercados noé")

    do {
        println("Ingresa el presio del producto")
        var presio:Int= readLine()!!.toInt()
        println("Ingresa la cantidad del producto")
        var cantidad:Int= readLine()!!.toInt()

        total=presio*cantidad

        if (total >= 50000){
            println("Puedes participar en nuestro concurso \n" +
                    "ya que estamos de anuversario.\n" +
                    " ya que tu compra es mayor a 50.000.\n" +
                    " participaras en un juego las reglas son: \n" +
                    " tenemos 4 bolitas (roja,azul,amarilla,blanca)\n" +
                    " si sacas la roja obtienes el derscuemto del 10%\n" +
                    " si sacas la azul obtienes el derscuemto del 30%\n" +
                    "si sacas la amarilla obtienes el derscuemto del 50%\n" +
                    "si sacas la blanca la compra es gratis")

            var bola:Int = (1..4).random()

            if (bola == 1) {
                val rojo=total*10/100
                println("as sacado la bola roja as conseguido el 10% ($rojo)")
            } else if (bola == 2) {
                val azul=total*30/100
                println("as sacado la bola azul as conseguido el 30% ($azul)")
            } else if (bola == 3) {
                val amarillo=total*50/100
                println("as sacado la bola amarilla as conseguido el 50% ($amarillo)")
            } else if (bola == 4) {
                val blanco=total*100/100
                println("as sacado la bola blanca tu compra es gratis ($blanco)")
            }
        } else {
            println("Lo sentimos no puedes partisipar en el sorteo :(")
            println("Valor a pagar: $total")
            print("Paga:")
            var paga:Int= readLine()!!.toInt()
            if (paga >= total){
                var cavio:Int=paga-total
                println("Canvio: $cavio")
            } else {
                var cavio:Int=paga-total
                println("Te ace falta dinero $cavio")
            }
        }

        println("deseas continuar Y/N")
        i= readLine()!!.toString().uppercase()
    }while (i == "Y")
}