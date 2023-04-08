package Herencia_clases_interfaces.Clases

class Profesor(
    var nombre:String,
    var profesion:String,
    var empresa:String): Persona() {
    override fun dormir() {
        println("Estoy descansando")
    }
    fun verDatos(){
        println("Profesion: $profesion Empresa: $empresa")
    }
}
