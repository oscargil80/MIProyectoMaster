package com.oscargil80.miproyectomaster.GLOSARIO.miDocument

//class hermanos (var nombre:String, var apellido:String, var edad:Int, var comida: Array<variedad>, var grupo:Array<hermanos>?){
//
//    enum class variedad{
//        Parrilla, Pizza, Hamburgueza, Perros, helado,
//    }
//fun comidas(){
//    for (i  in comida )
//        println("Hola esta es una prueba  -- >"+i)
//}
//
//
//}


class hermanos (var nombre:String, var apellido:String, var edad:Int, var comida: Array<variedad>, var grupo:Array<hermanos>?){

    enum class variedad{
        parrilla, Hamburgueza, Perro, Pizza, Helado
    }


    fun comidas(){
        for (i in  comida)
            println("Comida son "+i)
    }



}