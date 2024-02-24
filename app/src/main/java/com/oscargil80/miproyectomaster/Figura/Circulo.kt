package com.oscargil80.miproyectomaster.Figura

    class Circulo:Figura() {

    override var lados: Int
        get() = 7
        set(value) {}

        override fun dibujar() {
            println("Dibujando Circulos")
        }


    }