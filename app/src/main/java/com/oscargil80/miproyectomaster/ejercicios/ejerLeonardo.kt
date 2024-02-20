package com.oscargil80.miproyectomaster.ejercicios

fun main(){
//    //Ejercicio Numero 1
//    println("Introduzca el valor para verificar si es Par  o Impar")
//    println("El numero que has introducido es "+parImpar(readLine()!!.toInt() ))
//    /////
//  ///Ejercicio 2
//  var lista = arrayOf(1f,4f,15f)
//   println("La suma de los numeros introducidos dan un total final "+Sumar(lista))
//    //////Ejercicio 3
//    var numDes = arrayOf(10,15,20,2,7,8,6,28,90,50,66,77)
//    println("Los numeros del arreglo  que son pares son  ---->  ${ordPar(numDes).contentToString()}  y estan ordenados ")
//    ordPar(numDes)
////// Ejercicio 4
    println("Introduzca un numero pasa bes si aciertas la posicion de la X ")
    println("la posicion que intentas de adivinar es "+   adivinaPos(readLine()!!.toInt()))
}

 fun adivinaPos(num:Int):String{
     var array = arrayOf("0", "0","0")
//     array.shuffle() para desordenar laos valores //     array.forEach { //         print(" $it,") //     }
     var aleatorio:Int = (0..2).random()
     array.set(aleatorio, "x")
    // println(array.contentToString())

     if (num ==   array.indexOf("x"))   return "Correcto"  else  return "Incorrecto"
 }


fun ordPar(lista:Array<Int>):Array<Int>
{
    var numOrd = arrayOf<Int>()

    for (i in lista)
        if(i%2==0 )    numOrd += i
    numOrd.sort()
    return numOrd
}

fun parImpar (num: Int): String {
    var res = "impar"
    if(num % 2 == 0)   res =  "Par"   else  res = "Impar"
    return res
}

fun Sumar (lista:Array<Float>):Float{
    var tot = 0f
    for(i in lista)
        tot = tot+i
    return tot
}

