package com.oscargil80.miproyectomaster.Nomina

class sueldoAdmin( cedula: String, nombre:String, nivelEscala:String, condicion:String):administrativo(cedula, nombre, nivelEscala, condicion) {

    override fun calcularIngreso() {
        println("Calculando Ingreso")
    }

    override fun calcularDeducciones() {
        println("Calculando Deducciones")
    }

    override fun sueldoFinal() {
        println("Calculando Sueldo")
    }
}