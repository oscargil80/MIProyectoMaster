package com.oscargil80.miproyectomaster

//IGV = 18% * Valor de venta
//pf = valor de venta - IGV

fun main (){
            //-----------------------
            //var radio = 5.0
            //println("El area es "+areaTri(5, 6))
            //println("El area es  ${radio.pow(2)}")
            //-------------------------------

            //var valVen = 100 ; var IGV = (18.0/100)*100;   var pf = valVen - IGV
            //println("El IGV = $IGV")
            //println("El Precio Final es = $pf")

            // De horas a minutos
            //var hora:Int = 5
            //    println("$hora Horas son "+ aMin(hora)+" Minutos ")
            //    println("$hora Horas son "+ aSeg(hora)+" Segundos ")
            //    var nroMen:Int = 10 ;    var nroMay:Int = 19
            // println( "La cantida de numeros entre $nroMen y $nroMay  es "+hayNum(nroMen, nroMay))

//         var n = 10.0
//         println("La sum de cuadrados de $n = " + sCuadrados(n))

//    var hTrabajadas:Int = 50
//    var sPorHora = 18.5
//    println("El sueldo de este trabajador luego de haber trabajado $hTrabajadas Horas con un Sueldo por Hora de $sPorHora es  de "+cSalario(hTrabajadas, sPorHora))
//    println("El sueldo de este trabajador luego de haber trabajado $hTrabajadas Horas con un Sueldo por Hora de $sPorHora es  de ${hTrabajadas*sPorHora}")

//    var num:Int = 246;     var a:Int = num/100 ;    var b:Int = num % 100 / 10
//    var c:Int = num % 10
//    println("Dado el numero $num el inverso es $c$b$a")

//    var r = 10 ;    var R = -3;     var to = 16;   var n = 20.0 ;    var a = r/2;     var b = R-a;     var c = to
//    var t20 = (5 * (n.pow(2) )+ (b*n) ) + c
//    println(t20)

    println("Ingrese los siguientes datos ")
    println("Ingrese el primer coeficiente de segundo grado: ")
    var a = readLine()!!.toInt()

    println("Ingrese el Segundo coeficiente de segundo grado: ")
    var b = readLine()!!.toInt()

    println("Ingrese el Tercer coeficiente de segundo grado: ")
    var c = readLine()!!.toInt()

}


fun cSalario(hTrabajadas:Int, sPorHora:Double):Double{
    return hTrabajadas * sPorHora
}
fun sCuadrados(n:Double):Double{
    return  (n*(n+1) ) * ( 2*n + 1)  /6
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






