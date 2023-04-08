fun  esNumero(n1:Any):Boolean{
    if (n1 is Int){
        return true
    }
    return false
}
fun soloNumeros(lista:List<Any>):List<Any>{
    var nLista:MutableList<Any> = arrayListOf()
    for (i in lista){
        if (esNumero(i) == true){
            nLista.add(i)
        }
    }
    return nLista
}
fun main(args: Array<String>) {
    val lista = mutableListOf(1,'k',2,'o',3,'t',4,'l',5,"in")
    val verNumeros = soloNumeros(lista)
    println("")
    mostrarLista(verNumeros)
}
