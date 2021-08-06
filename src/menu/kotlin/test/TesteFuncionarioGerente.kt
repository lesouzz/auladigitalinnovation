package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.testes.one.digitalinnovation.digionebank.testes.Gerente

fun main() {
    val maria = Gerente("Maria do Carmo", "1234567899", 5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}