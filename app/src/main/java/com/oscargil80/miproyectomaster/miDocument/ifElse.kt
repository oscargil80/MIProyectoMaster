package com.oscargil80.miproyectomaster

fun main() {
    ifBasico()

    var num = 1..6
    println("es " +num.contains(2))


}



fun ifBasico(){

    val nombre: String = "Oscar"

    if(nombre == "pepe")
        println("es decir ")
    else if (nombre == "pep")
        println("es decir NO ")
    else
        println("es decir NO0 ")
}
