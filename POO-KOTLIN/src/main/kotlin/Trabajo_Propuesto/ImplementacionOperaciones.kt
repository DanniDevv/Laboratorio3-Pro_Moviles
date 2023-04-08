package Trabajo_Propuesto

import kotlin.math.pow

class ImplementacionOperaciones : OperacionesBasicas, OperacionesAvanzadas {
    override fun Suma(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    override fun Resta(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    override fun Multiplicación(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    override fun División(num1: Double, num2: Double): Double {
        return num1 / num2
    }

    override fun Potencia(numero: Double, potencia: Int): Double {
        return Math.pow(numero, potencia.toDouble())
    }

    override fun Raiz(numero: Double, raiz: Int): Double {
        return numero.pow(1.0/raiz)
    }

    override fun Factorial(numero: Int): Long {
        var resultado: Long = 1
        for (i in 1..numero) {
            resultado *= i
        }
        return resultado
    }

    override fun Sumatoria(numero: Int): Int {
        var resultado: Int = 0
        for (i in 1..numero) {
            resultado += i
        }
        return resultado
    }
    fun mostrarMenu() {
        println("Seleccione la operacion a realizar:")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Potencia")
        println("6. Raíz")
        println("7. Factorial")
        println("8. Sumatoria")
        println("9. Salir")
    }
}
