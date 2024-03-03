package com.oscargil80.miproyectomaster.Nomina

data class Empleado(
    var cedula:String= "",
    val nombre:String = "",
    val apellido:String= "",
    var tipoPer:String= "",
    val escala:String= "",
    val condicion:String= "",
    var ingreso: ingresosAdm = ingresosAdm(),
    var descuento: deducAdm = deducAdm()
)

    data class ingresosAdm(
    var sueldoBasico:Double = 0.0,
    var primaPorHijo:Double = 0.0,
    var primaAntiguedad:Double = 0.0,
    var primaJerarquia:Double = 0.0)

        data class deducAdm(
        var capUnefm:Double = 0.0,
        var seaUnefm:Double = 0.0,
        var estacionamiento:Double = 0.0,
        var seguroSocial:Double = 0.0)











