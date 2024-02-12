package com.oscargil80.miproyectomaster

fun main(){


    val ds = arrayOf(5,4,2,3,1)
    var pos:Int = 0
    var aux:Int = 0

    for(i in 0..ds.size-1)
    {
        //    var i:Int = 0
        pos = i
        aux = ds[i]
        println("Position $i que es el  Number - "+ds[i])
        println("Empieza - "+ds.contentToString())
        while( pos > 0 && ds[pos-1]>aux )
        {
            ds[pos] = ds[pos-1]
            pos--;
        }
        ds[pos] = aux;
        println("termina - "+ds.contentToString())
    }

}