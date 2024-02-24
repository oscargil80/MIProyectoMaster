package com.oscargil80.miproyectomaster.Figura

class Rectangulo: Figura(){

    override var lados: Int
        get() = 8
        set(value) {}

    override fun dibujar() {
        println("Dibujando Rectangulo")
    }


}