package com.oscargil80.miproyectomaster.GLOSARIO

fun main() {
    var res  = {a:Int, b: Int -> a+b}
    println(res(2,4))

    // Lo Mismo multiline

    var res2  = { a: Int, b: Int ->
        a + b
    }

    println(res2(2,4))

    val lista = listOf<Int>(5,2,4,8,9,7,10)
    var total = 0
    val  sumaPrecio:(List<Int>) -> Int = { lista -> lista.forEach{ total += it };total}
    val resta:(List<Int>) -> Int = {lista.forEach {total *=it};total }
    println(sumaPrecio(lista))
    println(resta(lista))


    }




