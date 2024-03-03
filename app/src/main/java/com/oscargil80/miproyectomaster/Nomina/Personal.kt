package com.oscargil80.miproyectomaster.Nomina

open class Personal ( ) {

    var I15460951 =  ingresosAdm(10.0, 10.0, 2.0, 1.0)
    var D15460951 = deducAdm(2.0, 1.0, 10.0, 1.5)
    var V15460951 = Empleado("15460951", "Oscar", "Medina", "02", "4-9", "Activo", I15460951, D15460951)


    open var cedula = V15460951.cedula
    open var nombre = V15460951.nombre
    open var apellido = V15460951.apellido
    open var tipoPer = V15460951.tipoPer
    open var nivelescala = V15460951.escala
    open var condicion = V15460951.condicion

}