package com.oscargil80.miproyectomaster.GLOSARIO.Figura

abstract  class Figura {

    abstract  fun dibujar()
    abstract  var lados:Int

    fun rellenar() {
        println("rellenando Figura")
    }
}