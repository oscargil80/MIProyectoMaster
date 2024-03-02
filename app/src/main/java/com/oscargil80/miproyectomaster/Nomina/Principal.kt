package com.oscargil80.miproyectomaster.Nomina

fun main () {

    var empleadoUnefm = sueldoAdmin()

    println("Cedula Empleado  -->"+empleadoUnefm.cedula)
    println("Nombre  Empleado -->"+empleadoUnefm.nombre)
    println("Apellido Empleado -->"+empleadoUnefm.apellido)
    println("Tipo Personal  Empleado -->"+empleadoUnefm.tipoPer)
    println("Nivel y Escala  Empleado -->"+empleadoUnefm.nivelescala)
    println("Condicion  Empleado --> "+empleadoUnefm.condicion)
    empleadoUnefm.calcularIngreso()
    empleadoUnefm.calcularDeducciones()
    empleadoUnefm.sueldoFinal()
}

