package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.testes.ImprimeRelatorioFuncionario.Companion.imprime


fun main(){
    val angelo = Analista("Angelo Marques","123.456.789.01", 2000.0)
    ImprimeRelatorioFuncionario.imprime(angelo)
}
