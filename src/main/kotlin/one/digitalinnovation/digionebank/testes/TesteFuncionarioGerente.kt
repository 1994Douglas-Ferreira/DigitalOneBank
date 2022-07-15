package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val roberto = Gerente("Roberto Carlos","369.258.147.09", 7000.0,"123Senha")
    ImprimeRelatorioFuncionario.imprime(roberto)

    TesteAutenticacao().autentica(roberto)
}
