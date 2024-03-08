package com.oscargil80.miproyectomaster.GLOSARIO

/*
*   Extension Functions: EXAMPLE ONE
* */
fun main(args: Array<String>) {

    var Alumno = Estudiante()
    println("aprobado: " + Alumno.haAprobado(57))

    println("Estado de la Beca: " + Alumno.isScholar(57))
    var name = "Oscar"
    println(name.uppercase())
    println(name.came())



        //Agregr funiones a clases desde aqui STRINGS
    var str1: String = "Hola "
    var str2: String = "Mundo"

    var str3: String = "Hey "

    println(str3.add(str1, str2))
  // fin
    //INT
    val x: Int = 16
    val y: Int = 10

    val valoMayor = x.valorMayor(y)
    println(valoMayor)

    //Funciones de extension ejeplo,



                                                            // Ejemplo de INFIX FUNCION cambia el llamado asi x valorMayor2 y
    val valoMayor2 = x valorMayor2 y
    println(valoMayor2)
}
 fun String.feliz():String{
  return "$this :)"
 }

fun String.came():String{
    var cam = this.first()
    return "$this.first().uppercase()+$this.substring(1, $this.length).lowercase()"
}

fun String.add(s1: String, s2: String): String {

    return this + s1 + s2
}
                                                                                                         //Agregr funiones a clases desde aqui INT
fun Int.valorMayor(other: Int): Int {

    if (this > other)
        return this
    else
        return other
}

infix  fun Int.valorMayor2(other: Int): Int {

    if (this > other)
        return this
    else
        return other
}


fun Estudiante.isScholar(Promedio: Int): Boolean {// desde le main puedes agregar una funcnion a la clase que quieras
    return Promedio > 95
}

class Estudiante {         // OUR OWN CLASS

    fun haAprobado(promedio: Int): Boolean {
        return promedio > 40
    }

}