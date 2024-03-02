package com.oscargil80.miproyectomaster.Nomina

 abstract class administrativo(cedula:String, nombre:String,  var nivelEscala:String, var condicion:String ):Personal(cedula, nombre) {

     init {
          nivelEscala = "4-5"
          condicion = "Activo"
     }

    abstract fun calcularIngreso()
    abstract  fun calcularDeducciones()
    abstract  fun sueldoFinal()

}