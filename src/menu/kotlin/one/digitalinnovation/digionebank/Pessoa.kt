package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Léo"
   var cpf: String = "155.545.545-77"
    private set

    constructor()
    fun pessoaInfo() = "$nome e $cpf"
}

fun main (){
    val leo = Pessoa ()
    println(leo.pessoaInfo())



}