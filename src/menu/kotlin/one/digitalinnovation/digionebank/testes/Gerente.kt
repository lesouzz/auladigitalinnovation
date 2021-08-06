package one.digitalinnovation.digionebank.testes.one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.testes.Funcionario

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.4

    override fun login(): Boolean = "senha123" == senha
}