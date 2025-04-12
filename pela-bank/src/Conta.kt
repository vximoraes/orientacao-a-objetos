class Conta(val numeroConta: String, val titular: Cliente) {
    private var saldo: Double = 0.0

    fun depositar (valor: Double) {
        if (valor > 0) {
            saldo += valor
        } else {
            println("Valor inválido para depósito.")
        }
    }
}