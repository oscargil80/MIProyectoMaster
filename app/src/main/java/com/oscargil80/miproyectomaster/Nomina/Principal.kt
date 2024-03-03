package com.oscargil80.miproyectomaster.Nomina

fun main () {



    var empleadoAdmi = sueldoAdmin()
    println("------------------------Datos Empleado------------------------------")
    println("Cedula - ${empleadoAdmi.cedula}           Nombre y Apellido - ${empleadoAdmi.nombre } ${empleadoAdmi.apellido } ")
    if (empleadoAdmi.tipoPer == "02")
        println("Tipo de Personal - Administrativo, Nivel y Escala  ${empleadoAdmi.nivelescala} De Condicion ${empleadoAdmi.condicion} " )
    else
        println("Academico, Nivel y Escala  ${empleadoAdmi.nivelescala} | De Condicion ${empleadoAdmi.condicion} " )


       empleadoAdmi.ingrAdm()
       empleadoAdmi.deduAdm()
       empleadoAdmi.suelFinAdm()

   /* var empleadoAcad = SueldoAcademico()

    println("Empleado | ${empleadoAcad.cedula} | ${empleadoAcad.nombre } ${empleadoAcad.apellido } |")
    if (empleadoAcad.tipoPer == "02")
       println("Administrativo, Nivel y Escala  ${empleadoAcad.nivelescala} | De Condicion ${empleadoAcad.condicion} " )
    else
        println("Academico, Nivel y Escala  ${empleadoAcad.nivelescala} | De Condicion ${empleadoAcad.condicion} " )
    println("Hola"+ $empleadoAcad.ingresoscar)

     empleadoAcad.calcularDeducciones()
    empleadoAcad.sueldoFinal()*/
}

