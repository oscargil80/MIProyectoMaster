package com.oscargil80.miproyectomaster.GLOSARIO

//Oscar--> los OBJECTS  no hace falta instanciarlos
/*
*   1. Object Declaration
* */
fun main(args: Array<String>) {

    CustomersData.count = 98
    CustomersData.typeOfCustomers()

    println(CustomersData.typeOfCustomers())

    CustomersData.count = 109
    println(CustomersData.count)

    CustomersData.myMethod("hello")

    var perso = hola()
    println("perso "+perso.nombre)

    println("perso 2"+hola2.nombre)

}

class hola{
    var nombre = "oscar"
    var apellido = "medina"
}

object  hola2{
    var nombre = "Luis"
    var apellido = "Lugo"
}

open class MySuperClass {

    open fun myMethod(str: String) { // Esta funcion esta sobreescrita (override) en un objeto
        println("MySuperClass")
    }
}

object CustomersData: MySuperClass() {      // Object Declaration

    var count: Int = -1             // Behaves like a STATIC variable

    fun typeOfCustomers(): String { // Behaves like a STATIC method
        return "Indian"
    }

    override fun myMethod(str: String) {    // Currently, behaving like a STATIC method
        super.myMethod(str)
        println("object Customer Data: $str")
    }
}