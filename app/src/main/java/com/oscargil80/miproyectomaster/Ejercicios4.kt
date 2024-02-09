package com.oscargil80.miproyectomaster

fun main(){
    //descuento()
  //  siPar()
   // mul3Y5()
    //cifra0()
    tipTriangulos()

}

 fun descuento(){
    var coste:Double
    val montoDescuento:Double =  50.0
    println("Introduzca el vamor del video Juego")
    var cos = readLine()!!.toDouble()

    if (cos>100)
        println("El Arti tiene un Costo de $cos Dolares, por el cual tiene un Descuento de 50% que son ${(cos*montoDescuento/100)} Bs,  para un total a pagar de ${cos - cos*montoDescuento/100}")
    else
        println("El articulo tiene un costo de $cos Dolares, por el cual no tiene  Descuento,  para un total a Pagar de $cos")
}    fun siPar(){
     var num:Int
     println("Ingrese un numero para saber si es par")
     num = readLine()!!.toInt()
     if (num % 2 == 0)
         println("El Numero es Par")
     else
         println("El Numero es Inpar")


 }  fun mul3Y5(){
     var num:Int
     println("Digite un numero para saber si es multiplo de 3 y de 5")
     num = readLine()!!.toInt()

     if (num % 3 == 0 && num % 5 == 0)
         println("El numero $num, es multiplo de 3 y 5")
     else
         println("El numero $num, No es multiplo de 3 y 5")
 } fun cifra0(){
    var num:Int
    println("Introduzca un numero para determinar si termina en cifra 0")
    num = readLine()!!.toInt()

    if(num % 10 == 0)
        println("El numero $num  termina en 0")
    else
        println("El numero $num  NO termina en 0")
}

fun tipTriangulos(){
    var lado1:Int ;    var lado2:Int;     var lado3:Int

    println ("Introdusca el lado 1");     lado1 = readLine()!!.toInt()
    println ("Introdusca el lado 2");    lado2 = readLine()!!.toInt()
    println ("Introdusca el lado 3");     lado3 = readLine()!!.toInt()

    if(lado1 == lado2 && lado2 == lado3)
        println("Segun los datos introducidos el triangulo es EQUILATERO")
    else  if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
        println("Segun los datos introducidos el triangulo es ISOSCELES")
    else  println("Segun los datos introducidos el triangulo es ESCALENO")
}