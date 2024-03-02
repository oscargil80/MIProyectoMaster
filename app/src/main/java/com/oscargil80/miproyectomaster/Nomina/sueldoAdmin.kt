package com.oscargil80.miproyectomaster.Nomina

class sueldoAdmin():administrativo() {

    override fun calcularIngreso() {
        println( "Calculando Ingreso")
    }

    override fun calcularDeducciones() {
        println("Calculando Deducciones")
    }

    override fun sueldoFinal() {
        println("Calculando Sueldo Final ")
    }
}