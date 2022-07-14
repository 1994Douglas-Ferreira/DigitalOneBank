package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.testes.ImprimeRelatorioFuncionario.Companion.imprime

fun main(){
    val roberto = Gerente("Roberto Carlos","369.258.147.09", 7000.0)
    ImprimeRelatorioFuncionario.imprime(roberto)
}
