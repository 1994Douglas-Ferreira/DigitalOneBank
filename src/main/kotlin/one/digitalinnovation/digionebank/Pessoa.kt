package one.digitalinnovation.digionebank

class Pessoa{
    var nome: String = "Douglas"
    var cpf: String ="123.456.789.10"
    private set

    constructor()

    fun pessoaInfo()= "$nome + $cpf"

}
fun main(){
    val douglas = Pessoa()
    println(douglas.pessoaInfo())

}