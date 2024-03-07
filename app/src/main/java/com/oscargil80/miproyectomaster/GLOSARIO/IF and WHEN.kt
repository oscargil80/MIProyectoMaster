package com.oscargil80.miproyectomaster.GLOSARIO
  //FUENTE -->  https://www.youtube.com/watch?v=2V6et2FdS8I&list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR&index=19&pp=iAQB
fun main(){

    val a = 2
    val b = 5

    var valorMax:Int

    if (a>b)
        valorMax = a
    else
            valorMax = b

    println("vaor max es "+valorMax)

/// tambien se puede hacer asi

    valorMax =    if (a>b)  a  else     b
    println("vaor max es "+valorMax)


    val x = 8

    when (x){
        1 ->println("Es uno  ") //Es asi de simpre
        3 -> { // cuando puedes poner varias lineas de codigo
                    println("Es 2")
                    println("Pero pilas porque puedes estar onfundido ")
               }
        10, 5 -> println("Es 10 o 2") // Cuando puedes poner dos numeros
        in 5..8 -> println("Esta entre 5 y ocho 8")// cuando depes poner un rango
        !in 15..20 -> println("NO esta entre 15 y 20") // cuando puedes poner que no este en ese rango
        else -> {
            println("NO es ninguno de los 2")
            println("Pero pilas porque tambien  puedes estar onfundido ")
        }

    }

    //tambien lo puedes hacer como variable
    val ran:String
    ran = when (x){
        1 -> "Es uno " //Es asi de simpre
        10, 5 -> "Es 10 o 2" // Cuando puedes poner dos numeros
        in 5..8 -> "Esta entre 5 y ocho 8"// cuando depes poner un rango
        !in 15..20 -> "NO esta entre 15 y 20" // cuando puedes poner que no este en ese rango
        else ->   { "NO es ninguno de los 2"
                        "Pero pilas "} // Puedes hacer esto pero la variable va ser asignada a la ultima
    }
    println(ran )




}