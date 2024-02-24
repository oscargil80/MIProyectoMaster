package com.oscargil80.miproyectomaster.Persona


open class Persona( var nombre: String,  var edad: Int , esEstudiante: Boolean = false): MiInterface {

    override var datos: String
        get() = "$nombre,$edad"
        set(value) {}
    open var estatus:String = ""

    init {
        println("Datos $datos")
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

    override fun trabajar() {
        println("Trabajando ")
    }
}



