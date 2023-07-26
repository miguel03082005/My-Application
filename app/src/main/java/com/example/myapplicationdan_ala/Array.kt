package com.example.myapplicationdan_ala

class Array {
}

fun main() {
    //sintasis array

    val pets = arrayOf("dog","cat","canary")
    println(pets.contentToString())

    //mostrar pocicion de un array

    println(pets[1])

    //remplazar balor de una pocicion

    pets[2]="capivara"

    //recorer array atraves de un for

    for (element in pets){
        println("la mascota es $element")
    }

    for ((index,element) in pets.withIndex()){
        println("la mascota numero $index es $element")
    }

    //lista inmutable

    val instrumento = listOf("trompeta","piano","violin")
    println(instrumento)

    val intrumentos: List<String> = listOf("trompeta","piano","violin")
    println(intrumentos)

    //lista mutable

    val instrumentos1= mutableListOf ("trompeta","a","violin")
    println(instrumentos1)

    //ultimo elemento de una lista

    val chars = ('A'..'Z').toList()
    println(chars.last()) // 'Z'

    //primer elemento de una lista

    val chars1 = ('A'..'Z').toList()
    println(chars1.first()) // 'A'

    //como agregar elementos a una lista mutable

    val list: MutableList<Int> = mutableListOf(1, 2, 3)        // o usa `arrayListOf`
    list.add(4)

    println(list)    // [1, 2, 3, 4

    //como quitar elementos de una lista mutable atraves de index

    val values = mutableListOf<Int> (1, 7, 4, 9, 6, 8, 9, 2)
    values.removeAt(6)
    println(values)

    //que pasa si quitas un elemento no existente? -- no genera error

    //como quitar elementos a una lista mutable

    val values1 = mutableListOf<Int> (1, 7, 4, 9, 6, 8, 9, 2)
    values1.remove(6)
    println(values1)

    //eliminar toda la lista

    val values2 = mutableListOf<Int> (1, 7, 4, 9, 6, 8, 9, 2)
    values2.clear()
    println(values2)
}