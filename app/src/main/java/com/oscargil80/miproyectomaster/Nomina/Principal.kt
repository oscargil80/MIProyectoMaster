package com.oscargil80.miproyectomaster.Nomina



fun main (){

    var I15460951 =  Ingresos(10.0, 10.1, 2.1, 1.1)
    var D15460951 = deducciones(2.0, 1.0, 10.0, 1.5)
    var V15460951 = Empleado("15460951", "Oscar", "Medina", "5-5", "Activo", "02", I15460951, D15460951)


    var empleadoUnefm = sueldoAdmin(V15460951.cedula, V15460951.nombre, V15460951.escala, V15460951.condicion)

    println(empleadoUnefm.cedula)
    println(empleadoUnefm.nombre)
    /*println(empleadoUnefm.apellido)
    println(empleadoUnefm.tipoPer)*/
    println(empleadoUnefm.nivelEscala)
    println(empleadoUnefm.condicion)
    println(empleadoUnefm.calcularIngreso())
    println(empleadoUnefm.calcularDeducciones())
    println(empleadoUnefm.sueldoFinal())

}