open class Conta(val numeroConta: String, val titular: Cliente) {
    private var saldo: Double = 0.0

    open fun getSaldo() {
        println("------------------------")
        println("Saldo: R$${saldo}")
        println("------------------------")
    }

    open fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito: R$${valor}")
        } else {
            println("Valor inválido para depósito.")
        }
    }

    open fun sacar(valor: Double) {
        if (valor > saldo) {
            println("Valor indisponível para saque.")
        } else {
            saldo -= valor
            println("Saque: R$${valor}")
        }
    }
}