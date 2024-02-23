package com.oscargil80.miproyectomaster.ejeClasObj


open class Persona( var nombre: String,  var edad: Int , esEstudiante: Boolean = false) {

    init {
        println("Nombre $nombre")
        println("Edad $edad")
        println("Estudiante? $esEstudiante")

    }

    fun caminar() {
        println("Caminando ")
    }

    fun comer() {
        println("Comiendo")
    }
}



