fun invertir(lista:List<Any>):List<Any>{
    val nLista = lista.reversed()
    return nLista
}

fun mostrarLista(lista: List<Any>){
    println("Elementos:")
    for(i in 0..(lista.count()-1)){
        print(lista.get(i))
    }
}
fun main(args: Array<String>) {
    val lista = mutableListOf(1,'k',2,'o',3,'t',4,'l',5,"in")
    val iLista = invertir(lista)
    mostrarLista(iLista)
}
