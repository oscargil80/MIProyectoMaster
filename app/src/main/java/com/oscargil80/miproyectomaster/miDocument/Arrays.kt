package com.oscargil80.miproyectomaster.ejercicios

import com.oscargil80.miproyectomaster.miDocument.hermanos

fun main(){
//    var arregloSim =DoubleArray(5)  {8.0} // se crea el arreglo asi o int, especificando que lleva 5 elementos y que cada uno lleva lel valo 8
//
    var arreglo = arrayOf(5,2,5,9,8,7,4) // asi se crea el arreglo y creo que es la manera que lo hare yo por siempre
//    var arreglo2 = intArrayOf(1,9,5,3,7,4) // se crea el arreglo de tipo int
//    var arregloDouble = doubleArrayOf(1.0, 5.0,80.0) // lo mismo de arroba pero Double, Strino no se puede
//    var arregloString  = arrayOf<String>("Hola", "Como", "Estas") // los estring se crean asi
//
//    println("hola - "+arreglo)// Imprimel direccion del arreglo, osea no se utiliza
//    arregloSim.set(3, 9.0) // asigna un valor al elemento del arreglo en la posicion especificada
//
//   for ((i, value) in arregloSim.withIndex()){ // es una manera de en el mismo for, obtener el valor del indice y el valor del arreglo en cada posicion
//        println ("hola ->"+arregloSim.get(i)+ "     Hola2 -> "+value)
//    }
//
//    // al ir i solamente estamos llamando al arreglo, no a la posicion, el valor de i toma el arreglo, no podemos usar i como posicion jamas
//    for (i in 1 .. arregloSim.size){
//        println ("hola ->"+i)
//    }

    var oscar = hermanos("Oscar", "Medina", 44, arrayOf(hermanos.variedad.Hamburgueza, hermanos.variedad.Perro), null)
    oscar.comidas()
    println("Hola el amigo es "+oscar.grupo?.first()?.nombre)

    var linin = hermanos("Linin ", "Linin", 48, arrayOf(hermanos.variedad.parrilla, hermanos.variedad.Hamburgueza),
        arrayOf(oscar) )
    linin.comidas()
    println("Hola el amigo es "+linin.grupo?.first()?.nombre)

   /* var Linin = hermanos("Linin", "Medina", 48, arrayOf(hermanos.variedad.Parrilla, hermanos.variedad.helado), arrayOf(oscar))
    Linin.comidas()
    println("Hola el amigo es "+Linin.grupo?.first()?.nombre)*/


}



