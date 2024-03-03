package com.oscargil80.miproyectomaster.Nomina

class sueldoAdmin():administrativo() {


    var totalIng = 0.0
    var totalDed = 0.0
    var totalGen = 0.0

    override fun ingrAdm() {
        println("-----------------------Asignaciones----------------------------------")
        println("Sueldo Basico "+ V15460951.ingreso.sueldoBasico)
        println("Prima Por Hijos "+ V15460951.ingreso.primaPorHijo)
        println("Prima de Antiguedad "+ V15460951.ingreso.primaAntiguedad)
        println("Prima de Jerarquia "+ V15460951.ingreso.primaJerarquia)
        totalIng = V15460951.ingreso.sueldoBasico.toDouble()+
                V15460951.ingreso.primaPorHijo.toDouble()+
                V15460951.ingreso.primaAntiguedad.toDouble()+
                V15460951.ingreso.primaJerarquia.toDouble()
        println("Total ---> $totalIng")
    }

    override fun deduAdm() {
        println("-----------------------Deducciones-----------------------------------")

        println("Caja de Ahorros "+ V15460951.descuento.capUnefm)
        println("SEAUNEFM "+ V15460951.descuento.seaUnefm)
        println("Estacionamiento "+ V15460951.descuento.estacionamiento)
        println("Seguro Social "+ V15460951.descuento.seguroSocial)
        totalDed = V15460951.descuento.capUnefm.toDouble()+
                V15460951.descuento.seaUnefm.toDouble()+
                V15460951.descuento.estacionamiento.toDouble()+
                V15460951.descuento.seguroSocial.toDouble()
        println("Total ---> $totalDed")
    }

    override fun suelFinAdm() {
        totalGen = totalIng-totalDed
        println("-----------------------Sueldo a Cobrar-----------------------------------")
        println("Total General a Cobrar  = "+totalGen)
    }
}