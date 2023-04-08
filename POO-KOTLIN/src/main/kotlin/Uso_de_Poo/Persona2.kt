package Uso_de_Poo


fun main(args: Array<String>) {
    val personas:MutableList<Persona> = arrayListOf()
    for (i in 1..5){
        val persona=Persona("User$i", (18..30).random())
        personas.add(persona)
    }
    for (i in personas){
        println("Nombre: ${i.nombre} Edad: ${i.edad}")
    }
}



