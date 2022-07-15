package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista


fun main(){
    val angelo = Analista("Angelo Marques","123.456.789.01", 2000.0)
    ImprimeRelatorioFuncionario.imprime(angelo)
}
