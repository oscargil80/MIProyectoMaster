package com.oscargil80.miproyectomaster.Persona

class Maestro (nombre: String, edad:Int): Persona(nombre , edad){

fun enseñar (){
    println("Enseñando la materia")
}

    override var estatus: String
        get() = "Activo"
        set(value) {}

    override fun dormir() {
        println("Esta durmiendo tambien")
    }
}




/*
class Maestro(nombre: String, edad: Int) : Persona(nombre, edad) {

    fun enseñar() {
        println("Enseñando la materia")
    }

    override var estatus: String
        get() = "Activo"
        set(value) {}

    override fun dormir() {
        println("Durmiendo Tambien")
    }
}*/
