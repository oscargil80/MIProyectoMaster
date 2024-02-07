package com.oscargil80.miproyectomaster

//IGV = 18% * Valor de venta
//pf = valor de venta - IGV

fun main (){
    var radio = 5.0
    //println("El area es "+areaTri(5, 6))
    //println("El area es  ${radio.pow(2)}")
    var valVen = 100 ; var IGV = (18.0/100)*100;   var pf = valVen - IGV
    //println("El IGV = $IGV")
    //println("El Precio Final es = $pf")

    // De horas a minutos
    var hora:Int = 5
//    println("$hora Horas son "+ aMin(hora)+" Minutos ")
//    println("$hora Horas son "+ aSeg(hora)+" Segundos ")
    var nroMen:Int = 10 ;    var nroMay:Int = 19
    println( "La cantida de numeros entre $nroMen y $nroMay  es "+hayNum(nroMen, nroMay))
}

fun areaTri(base:Int, altura:Int):Int{
    return (base*altura)/2
}

fun aMin(hora:Int):Int{
    return hora*60
}

fun aSeg(hora:Int):Int{
    return (aMin(hora)*60)
}

fun hayNum(nroMen:Int, nroMay:Int):Int{
    return (nroMay-nroMen) - 1
}






