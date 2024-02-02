package com.oscargil80.miproyectomaster

fun main() {
    getMonth(3)
    println("---")
    getTrimester(3)
    println("---")
    getSemester(7)
}

fun getSemester(month: Int) {
    when (month) {
        in 1..6 -> print("Primer Semestre")
        in 7..12 -> print("Segundo Semestre")
    }

}


fun getMonth(month: Int) {
    when (month) {
        1 -> print("Enero")
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> print("Noviembre")
        12 -> print("Diciembre")
        else -> println("Es otro mes")
    }
}

fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> print("Primer Trimestre")
        4, 5, 6 -> print("Segundo Trimestre")
        7, 8, 9 -> print("Tercer Trimestre")
        10, 11, 12 -> print("Cuarto Trimestre")
    }
}
