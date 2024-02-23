package com.oscargil80.miproyectomaster.ejeClasObj

class Jugador(nombre: String, edad: Int) : Persona(nombre, edad) {

    fun jugar(){
        println("Esta jugando")
    }
}