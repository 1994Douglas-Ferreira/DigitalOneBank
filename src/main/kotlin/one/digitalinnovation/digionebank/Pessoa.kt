package one.digitalinnovation.digionebank

class Pessoa{
    var nome: String = "Douglas"
    var cpf: String ="123.456.789.10"

}
fun main(){
    val douglas = Pessoa()

    println(douglas.nome)
    print(douglas.cpf)
}