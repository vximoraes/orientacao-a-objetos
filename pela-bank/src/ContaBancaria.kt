open class ContaBancaria(val titular: String) {
    private var saldo: Double = 0.0

    fun getSaldo() {
        println("------------------------")
        println("Saldo: R$${saldo}")
        println("------------------------")
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito: R$${valor}")
        } else {
            println("Valor inválido para depósito.")
        }
    }

    fun sacar(valor: Double) {
        if (valor > saldo) {
            println("Valor indisponível para saque.")
        } else {
            saldo -= valor
            println("Saque: R$${valor}")
        }
    }
}