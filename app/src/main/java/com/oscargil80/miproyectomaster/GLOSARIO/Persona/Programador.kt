package com.oscargil80.miproyectomaster.GLOSARIO.Persona

class Programador(nombre:String, edad:Int): Persona(nombre, edad){

 fun Programar(){
     println("Programando ")
 }

    override fun dormir() {
        println("No duerme porque es programador")
    }

    override var estatus: String
        get() = "Activisimo"
        set(value) {}
}