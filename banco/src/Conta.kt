import java.util.Date

class Conta(val numeroConta: String, val cliente: Cliente) {
    private var saldo: Double = 0.0

    fun depositar(valor: Double) {
        if (valor > 0) {
            saldo += valor
            println("Depósito: R$${valor}")
            val transacao = Transacao(valor, Date())
            transacao.executar("Depositar")
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
            val transacao = Transacao(valor, Date())
            transacao.executar("Sacar")
        }
    }

    fun obterSaldo(): Double {
        println("Saldo: R$${saldo}")
        return saldo
    }
}