package com.oscargil80.miproyectomaster.ejercicios

fun main(){
    //Ejercicio Numero 1
    //println("Introduzca el valor para verificar si es Par  o Impar")
    //println("El numero que has introducido es "+parImpar(readLine()!!.toInt() ))
    /////
  ///Ejercicio 2
    var lista = arrayOf(1f,4f,15f)
    println("La suma de los numeros introducidos dan un total final "+Sumar(lista))
}

fun parImpar (num: Int): String {
    var res = "impar"
    if(num % 2 == 0)   res =  "Par"   else  res = "Impar"
    return res
}

fun Sumar (lista:Array<Float>):Float{
    var tot:Float = 0f
    for((i, value) in lista.withIndex())
        tot = tot+value
    return tot
}
