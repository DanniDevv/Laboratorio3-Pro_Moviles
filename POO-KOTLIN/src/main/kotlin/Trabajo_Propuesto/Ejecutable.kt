package Trabajo_Propuesto

fun main(){
    val op = ImplementacionOperaciones()
    var salir = false

    do{
        op.mostrarMenu()
        print("Seleccione una opcion: ")
        val opcion = readLine()?.toIntOrNull()

        when (opcion){
            1 -> {
                print("Ingrese el primer número: ")
                val num1 = readLine()?.toDoubleOrNull() ?: continue
                print("Ingrese el segundo número: ")
                val num2 = readLine()?.toDoubleOrNull() ?: continue
                println("El resultado es: ${op.Suma(num1, num2)}")
            }

            2 -> {
                print("Ingrese el primer número: ")
                val num1 = readLine()?.toDoubleOrNull() ?: continue
                print("Ingrese el segundo número: ")
                val num2 = readLine()?.toDoubleOrNull() ?: continue
                println("El resultado es: ${op.Resta(num1, num2)}")
            }

            3 -> {
                print("Ingrese el primer número: ")
                val num1 = readLine()?.toDoubleOrNull() ?: continue
                print("Ingrese el segundo número: ")
                val num2 = readLine()?.toDoubleOrNull() ?: continue
                println("El resultado es: ${op.Multiplicación(num1, num2)}")
            }

            4 -> {
                print("Ingrese el primer número: ")
                val num1 = readLine()?.toDoubleOrNull() ?: continue
                print("Ingrese el segundo número: ")
                val num2 = readLine()?.toDoubleOrNull() ?: continue
                println("El resultado es: ${op.División(num1, num2)}")
            }

            5 -> {
                print("Ingrese el primer número: ")
                val numero = readLine()?.toDoubleOrNull() ?: continue
                print("Ingrese la potencia: ")
                val potencia = readLine()?.toIntOrNull() ?: 0
                println("El resultado es: ${op.Potencia(numero, potencia)}")
            }

            6 -> {
                print("Ingrese el primer número: ")
                val numero = readLine()?.toDoubleOrNull() ?: continue
                print("Ingrese la raiz: ")
                val raiz = readLine()?.toIntOrNull() ?: continue
                println("El resultado es: ${op.Raiz(numero, raiz)}")
            }

            7 -> {
                print("Ingrese el primer número: ")
                val numero = readLine()?.toIntOrNull() ?: continue
                println("El resultado es: ${op.Factorial(numero)}")
            }

            8 -> {
                print("Ingrese el primer número: ")
                val numero = readLine()?.toIntOrNull() ?: continue
                println("El resultado es: ${op.Sumatoria(numero)}")
            }
            9 -> salir = true
            else -> println("Opcion Erronea")

        }

        if (!salir){
            print("¿Quiere realizar otra operacion? ==> (S/N):")
            val respuesta = readLine()?.toUpperCase()
            if (respuesta != "S"){
                salir = true
            }
        }
    } while (!salir)
}