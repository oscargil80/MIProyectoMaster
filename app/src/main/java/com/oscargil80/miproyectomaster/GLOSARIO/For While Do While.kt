package com.oscargil80.miproyectomaster.GLOSARIO

//FUENTE  ---> https://www.youtube.com/watch?v=S_DDdmsOyVE&list=PLlxmoA0rQ-LwgK1JsnMsakYNACYGa1cjR&index=20

fun main (){

                                                                                                     // For Loop
   /* for (i in 1..40)
    {
       // println("For Sencillo con break->$i")
        if(i ==10)
            break
    }*/
                                                                                                                                        // // For Anidado
   /* for (i in 1..4)
    {
         for (j in 1..4){
            println("$i   $j")
            if (i == 2 && j ==2 ){
                println("Aqui")
            }
         }
     }*/

                                                                                                                                         // // For Anidado con break
    /*loop@ for (i in 1..4)
    {
        for (j in 1..4){
            println("$i   $j")
            if (i == 2 && j ==2 ){
                println("Aqui")
                break@loop    //// El break no funciona sino se identifica
            }
        }
    }*/

                                                                                                                                              // // For Anidado con continue
    for (i in 1..4)
    {
        if(i==3){
            continue
        }
        println("i-->" +i)
    }


    println("While \n")
                                                                                                                                         //En arreglos
    var arr = arrayOf(10,20,30,40,50)
/*
    for (i in arr)
        println("For sencillo Valor"+i)

    for (i in arr.indices)
        println("For con Indices "+i)

    for ((i, value) in arr.withIndex()) {
        println("Pidiendo 2 valores, Indices = " + i)
        println("Pidiendo 2 valores, valor  =" + value)
    }      */
                                                                                                                                        // forEach en arreglos
   /* arr.forEach { println("ForEach sencillo  "+it) }
    arr.forEach { if (it >20 ) println("ForEach con condicion "+it) }*/

                                                                                                     // While
    var i:Int = 1
    while (i<5)
    {
       // println("Hello")
        i++
    }
                                                                                                     //DO While
    println("Do While \n")
    i = 1
    do {
      //  println("Hello")
        i++
    } while (i<5)


}