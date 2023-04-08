fun saludo(){
    println("Bienvenido a kotlin")
}
fun suma(n1:Int, n2:Int, n3:Int = 0){
    val sum = n1 + n2 + n3
    println("La suma de $n1 y $n2 es $sum")
}
fun main(args: Array<String>) {
    saludo()
    print("Ingrese numero 1: ")
    val num1 = readLine().toString().toInt()
    print("Ingrese numero 2: ")
    val num2 = readLine().toString().toInt()
    suma(num1,num2)
    suma(num1,num2,10)
}


