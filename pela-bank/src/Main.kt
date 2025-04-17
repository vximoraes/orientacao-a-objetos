fun main() {
    val conta = ContaBancaria("Vinícius Moraes")

    conta.getSaldo()
    conta.depositar(500.0)
    conta.getSaldo()
    conta.sacar(400.0)
    conta.getSaldo()
}