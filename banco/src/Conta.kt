import java.util.Date

class Conta(val numeroConta: String, val cliente: Cliente) {
    // Atributo privado para garantir que o saldo só possa ser acessado e modificado por métodos controlados da classe
    private var saldo: Double = 0.0

    // Método público para realizar depósitos, permitindo adicionar valores ao saldo de forma controlada
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

    // Método público para realizar saques, permitindo subtrair valores do saldo de forma controlada
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

    // Método público para consultar o saldo, fornecendo acesso seguro ao estado atual do saldo
    fun obterSaldo(): Double {
        println("Saldo: R$${saldo}")
        return saldo
    }
}