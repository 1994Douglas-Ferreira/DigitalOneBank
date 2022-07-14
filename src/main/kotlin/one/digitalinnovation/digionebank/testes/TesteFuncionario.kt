package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val douglas = Pessoa()
    println("${douglas.nome} - ${douglas.cpf}")

    val angelo = Funcionario("Angelo Marques","123.456.789.01", BigDecimal.valueOf(2000.0))
    println("${angelo.nome} - ${angelo.cpf} - ${angelo.salario}")
}