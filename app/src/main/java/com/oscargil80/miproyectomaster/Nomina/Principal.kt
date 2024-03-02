package com.oscargil80.miproyectomaster.Nomina



fun main (){
    println("Inicioooo")
    var emple:Empleado
    var I15460951 =  Ingresos(10.0, 10.1, 2.1, 1.1)
    var D15460951 = deducciones(2.0, 1.0, 10.0, 1.5)
    var V15460951 = Empleado("15460951", "Oscar", "Medina", "5-5", "Activo", I15460951, D15460951)

     println(V15460951.ingreso.sueldoBasico)
     println(V15460951.ingreso.primaPorHijo)
     println(V15460951.ingreso.primaAntiguedad)
     println(V15460951.ingreso.primaJerarquia)
     println(V15460951.nombre)




}