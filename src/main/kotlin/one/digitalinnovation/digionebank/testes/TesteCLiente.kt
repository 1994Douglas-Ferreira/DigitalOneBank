package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val andressa = Cliente(
        nome = "Andressa Santos",
        cpf = "478.098.743-21",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(andressa)

    TesteAutenticacao().autentica(andressa)
}
