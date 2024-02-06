package com.oscargil80.miproyectomaster


//De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
//Kelvin a Celsius: °C = K - 273.15
//De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15

//printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
//printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
//printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }


fun main() {
    printFinalTemperature(25.0, 27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
    //printFinalTemperature(350.0, "Kelvin", "Celsius") { it - 273.15 }
   //printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
  //  println(it)

}

fun printFinalTemperature(
    otro:Double,
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
)
{
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

//27.0 degrees Celsius is 80.60 degrees Fahrenheit.
//350.0 degrees Kelvin is 76.85 degrees Celsius.
//10.0 degrees Fahrenheit is 260.93 degrees Kelvin.