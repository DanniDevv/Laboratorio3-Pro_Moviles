fun suma2(vararg n1:Int){
    var suma = 0
    for (i in n1){
        suma += i
    }
    println("La suma de los numeros es $suma")
}
fun main(args: Array<String>) {
    suma2(1, 2, 3, 4, 5)
}
