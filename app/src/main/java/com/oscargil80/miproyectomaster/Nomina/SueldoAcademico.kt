package com.oscargil80.miproyectomaster.Nomina

class SueldoAcademico():Academico() {

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