package com.oscargil80.miproyectomaster.miDocument

fun main(){

    var mapa  = mapOf("Cod1" to 10, "Cod2" to 92, "Cod3" to  3, "Cod4" to  4,  "Cod5" to  5,  "Cod6" to  6)
    var mapa2  = mutableMapOf(3 to "Cod4" ,  2 to "Cod2" , 1 to "Cod3", 4 to "Cod4" ,   6 to  "Cod6" )

    println("Codigo "+mapa.get("Cod1"))
    println(" Se encuentra esa Keys Cod1  -> "+mapa.containsKey("Cod1")) // Devuelve solo  si es positivo o negativo
    println(" Se encuentra esa Values  1  -> "+mapa.containsValue(1)) // Devuelve solo  si es positivo o negativo
    println(" Muestra todos los Values  -> "+mapa.values) // Muestra todos los Values
    println("Estas son las claves   "+mapa.keys) // Muestra todas las keys
    //println("Estas son las claves   "+mapa.all { mapa2.get(1) == 1 } )// Muetra tru si  se cumple la condicion

//    mapa2["Cod1"]= 2
//    println(mapa2)
//    mapa2.set("Cod7", 10)
//    println(mapa2)

  //  mapa2.put("Cod7", 11)
    println("--------------")
    println(mapa2)

    var mapa3 = mapa2.toSortedMap() // lo iguala al mapa ordenado
    println("--------------")
    println(mapa3)


}