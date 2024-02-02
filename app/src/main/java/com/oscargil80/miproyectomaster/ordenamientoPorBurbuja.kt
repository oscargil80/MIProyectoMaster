package com.oscargil80.miproyectomaster

fun main(){

    var ds= arrayOf(5,2,3,1,4)

    var aux:Int = 0


    for (i in 0 .. ds.size-1)
    {
        for (j in 0 .. ds.size-2)
        {
            if(ds[j] < ds[j+1])
            {
                aux =ds[j] //5
                ds[j] = ds[j+1] // 5 = 4
                ds[j+1] = aux // 4 = 5
            }
        }
    }

//    for(i in ds.indices)
//        println("indice con []   "+ds[i])
//
//    for(i in ds.indices)
//        println("Indice con .get "+ds.indexOf(i))

    for( i in ds)
        println(" $i simpl  "+ds.indexOf(i))

//    for( (i, value) in ds.withIndex() )
//        println("$i simple    $value")


    /// pongo Hola porque me da la gana
}
