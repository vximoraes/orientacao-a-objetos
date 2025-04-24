class ContaSalario(numeroConta: String, titular: Cliente, salario_mensal: Double = 0.0) : Conta(numeroConta, titular) {
    private var salario_mensal: Double = salario_mensal

    override fun depositar(valor: Double) {
        if(valor > 0) {
            super.depositar(valor * 1.1)
        } else {
            println("Valor de depósito inválido.")
        }
    }
}