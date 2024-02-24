package com.oscargil80.miproyectomaster.ejeClasObj

class Jugador(nombre: String, edad: Int) : Persona(nombre, edad) {

    fun jugar(){
        println("Esta jugando")
    }

    override var estatus: String
        get() = "Jugador activo"
        set(value) {}

    override fun dormir() {
        println("Durmiendo Cansado despues de jugar")
    }
}