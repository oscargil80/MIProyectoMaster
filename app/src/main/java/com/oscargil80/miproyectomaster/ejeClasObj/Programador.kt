package com.oscargil80.miproyectomaster.ejeClasObj

class Programador(nombre: String, edad: Int) : Persona(nombre, edad) {

    fun Programar() {
        println("Esta Programando")
    }

    override var estatus: String
        get() = "Programador senior"
        set(value) {}

    override fun dormir() {
        println("Casi no duermo por programar pero bien ")
    }
}