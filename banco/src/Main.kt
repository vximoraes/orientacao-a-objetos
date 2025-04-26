fun main() {
    val cliente = Cliente("Vinícius Moraes", "1")
    val conta = Conta("1", cliente)
    val agencia = Agencia("Agência")
    val banco = Banco("Banco")

    println("---------------------------------")

    conta.depositar(500.0)
    conta.sacar(500.0)
    conta.obterSaldo()

    println("---------------------------------")

    agencia.adicionarConta(conta)
    agencia.obterConta("1")
    agencia.removerConta(conta)
    agencia.obterConta("1")

    println("---------------------------------")

    banco.adicionarAgencia(agencia)
    banco.obterAgencia("Agência")
    banco.removerAgencia(agencia)
    banco.obterAgencia("Agência")
}