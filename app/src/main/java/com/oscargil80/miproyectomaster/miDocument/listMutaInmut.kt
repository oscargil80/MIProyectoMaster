package com.oscargil80.miproyectomaster.miDocument



fun main  (){
    var list = listOf(1,2,5,8,7,6) // No se puede Modificar porque no es mutable
    var list2 = listOf(1,2,5,3,7,6)
    println("Lista Completa  \n $list")
    println("Un elemento de la lista en este caso el 3er  \n ${list.indexOf(2)}") // Pendiente de las llaves
    println("Muestra los elementos desde un indice a  otro \n ${list.subList(1,5)}") // Pendiente de las llaves
    println(" muestra el indice mayor ${list.lastIndex}")
    println(" Muestra el indice del elemento 3 ${list.lastIndexOf(3)}") // Devuelve el indice del elemtno especificado sino esta en la lista da -1
    println(" Me dice si el elemtno esta  ${list.contains(3)}") // Me dice true si el elemento esta en la lista y false sino esta
    println(" Me voltea la lista "  +  list.asReversed())
    println(" Compara 2 listas "  +  list.containsAll(list2))

    //Inmutable List

    var listM = mutableListOf<Int>(10,25,50,8,71,68,68, 68, 10) // No se puede Modificar porque no es mutable
    var listM2 = mutableListOf(1,2,5,3,7,6)
    var listM3 = arrayListOf(1,2,5,3,7,6)

    var listM5 = mutableSetOf(listM)



    //println("Lista Completa M5  \n $listM5") // Son listas que elimina los valores repetidos
    println("Lista Completa  \n $listM")
    println("Lista Completa sin repetisiones   \n ${listM.toMutableSet()}") // elimina los elementos repetidos
    listM.add(2)
    listM.add(2,99)// cambia el valor del elemento 3,  pero no lo elimina sino que lo corre
    listM.set(3,88)// cambia el valor del elemento 2, eliminado asi el elemento 2, es decir lo sustituye

    println("Lista Completa  \n $listM")
    listM.sort()

    println("Lista Completa  \n $listM")


    println("Un elemento de la lista en este caso el 68  \n ${listM.indexOf(68)}") // muestra el indice de un elemento en especifico en este caso el 68
    println("Muestra los elementos desde un indice a  otro \n ${listM.subList(1,5)}") // Pendiente de las llaves
    println(" muestra el indice mayor ${listM.lastIndex}")
    println(" Muestra el indice del elemento 71 ${listM.lastIndexOf(71)}") // Devuelve el indice del elemtno especificado sino esta en la lista da -1
    println(" Me dice si el elemtno esta  ${listM.contains(3)}") // Me dice true si el elemento esta en la lista y false sino esta
    println(" Me voltea la lista "  +  listM.asReversed())
    println(" Compara 2 listas "  +  listM.containsAll(listM2))
    println("Elimina el elemento"+listM.remove(1))
    listM[1]= 3

}