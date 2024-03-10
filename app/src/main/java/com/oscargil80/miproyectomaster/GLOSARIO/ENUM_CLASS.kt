package com.oscargil80.miproyectomaster.GLOSARIO


interface ICardCashBack {
    fun getPorcentajeInteres(): Float
}

enum class TipoTarjetaCredito(val color: String, val maxLimit: Int = 1000000): ICardCashBack {
    PLATEADA("GRIS", 50000) {
        override fun getPorcentajeInteres(): Float = 0.02f
    },
    DORADA("ORO"){
        override fun getPorcentajeInteres(): Float = 0.04f
    },
    PLATINIUM("NEGRA"){
        override fun getPorcentajeInteres(): Float = 0.06f
    }
}


fun main() {

    /* Access properties and methods */
    println(TipoTarjetaCredito.PLATEADA.color)    // gray
    println(TipoTarjetaCredito.PLATEADA.getPorcentajeInteres())   // 0.02

    /* Enum constants are objects of enum class type. */
    val peterCardType: TipoTarjetaCredito = TipoTarjetaCredito.DORADA

    /* Each enum object has two properties: ordinal and name */
    println(TipoTarjetaCredito.DORADA.ordinal)
    println(TipoTarjetaCredito.DORADA)    // OR CreditCardType.GOLD.name

    /* Each enum object has two methods: values() and valueOf() */
    val myConstants: Array<TipoTarjetaCredito> = TipoTarjetaCredito.values()
    myConstants.forEach { println(it) }

    /* Using in 'when' statement */
    when(peterCardType) {
        TipoTarjetaCredito.PLATEADA -> println("Peter has silver card")
        TipoTarjetaCredito.DORADA -> println("Peter has gold card")
        TipoTarjetaCredito.PLATINIUM -> println("Peter has platinum card")
    }
}


