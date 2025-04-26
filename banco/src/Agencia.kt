class Agencia(val nome: String) {
    private var contas = mutableListOf<Conta>()

    fun adicionarConta(conta: Conta) {
        contas.add(conta)
        println("Conta ${conta.numeroConta} adicionada com sucesso!")
    }

    fun removerConta(conta: Conta) {
        val contaDeletar = contas.find { it.numeroConta == conta.numeroConta }

        if (contaDeletar == null) {
            println("Nenhuma conta encontrado pelo nome '${nome}'.")
        } else {
            contas.remove(contaDeletar)
            println("Conta com número '${conta.numeroConta}' deletada com sucesso!")
        }
    }

    fun obterConta(numero: String): Conta? {
        val contaEncontrada = contas.find { it.numeroConta == numero }
        if (contaEncontrada != null) {
            println("Conta(s) com numero '${contaEncontrada.numeroConta}'")
            println(contaEncontrada)
        } else {
            println("Conta não encontrada.")
        }

        return contaEncontrada
    }
}