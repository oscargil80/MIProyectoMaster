package com.oscargil80.miproyectomaster.ejeClasObj


open class Persona( var nombre: String,  var edad: Int , esEstudiante: Boolean = false) {


    open var estatus:String = ""

    init {
        println("Nombre $nombre")
        println("Edad $edad")
        println("Estudiante? $esEstudiante")
        println("estatus $estatus")

    }

    fun caminar() {
        println("Caminando ")
    }

    fun comer() {
        println("Comiendo")
    }

   open  fun dormir() {
        println("Durmiendo")
    }
}



