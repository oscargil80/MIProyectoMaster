package com.oscargil80.miproyectomaster.GLOSARIO

/*
*   Extension Functions: EXAMPLE ONE
* */
fun main(args: Array<String>) {

   /* var Alumno = Estudiante()
    println("aprobado: " + Alumno.haAprobado(57))

    println("Estado de la Beca: " + Alumno.isScholar(57))
    var name = "Oscar"
    println(name.uppercase())
    println(name.came())*/

 /*   var lala = null // asi se declara nullo

    if (lala.esNulo())
        println("Oscar es nulo")
    else
        println("Oscar NO nulo")*/

        //Agregr funiones a clases desde aqui STRINGS
 /*   var str1: String = "Hola "
    var str2: String = "Mundo"

    var str3: String = "Hey "

    println(str3.add(str1, str2))
  // fin
    //INT
    val x: Int = 16
    val y: Int = 10

    val valoMayor = x.valorMayor(y)
    println(valoMayor)
*/
    //Funciones de extension ejeplo,



                                                            // Ejemplo de INFIX FUNCION cambia el llamado asi x valorMayor2 y
  /*  val valoMayor2 = x valorMayor2 y
    println(valoMayor2)*/

    val arreglo1= IntArray(10, {it})
    arreglo1.imprimir()

    val nom= "venezuela"
    nom.imprimir()

    val ent = 10
    ent.hasta(40)
    35.hasta(40)

}

fun IntArray.imprimir() {
    print("[")
    for(elemento in this) {
        print("$elemento ")
    }
    println("]");
}

fun String.imprimir() {
    for(elemento in this) {
        print("-")
        print("$elemento ")
    }
    println(" ")
}

fun Int.hasta(has:Int) {
    for (i in this..has){
    print("$i-")
        }
    println(" ")
}

fun Int.hasta2(fin: Int) {
    for(valor in this..fin)
        print("$valor-")
    println()
}

fun Any?.esNulo():Boolean{
    return this == null
}


 fun String.feliz():String{
  return "$this :)"
 }

fun String.came():String{
    var cam = this.first().uppercase()+this.substring(1, this.length).lowercase()
    return cam
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