class Agencia(val nome: String) {
    // Atributo privado para proteger a lista de contas, garantindo que apenas métodos da classe possam manipulá-la
    private var contas = mutableListOf<Conta>()

    // Método público para adicionar uma conta à lista
    fun adicionarConta(conta: Conta) {
        contas.add(conta)
        println("Conta ${conta.numeroConta} adicionada com sucesso!")
    }

    // Método público para remover uma conta da lista
    fun removerConta(conta: Conta) {
        val contaDeletar = contas.find { it.numeroConta == conta.numeroConta }

        if (contaDeletar == null) {
            println("Nenhuma conta encontrado pelo nome '${nome}'.")
        } else {
            contas.remove(contaDeletar)
            println("Conta com número '${conta.numeroConta}' deletada com sucesso!")
        }
    }

    // Método público para buscar uma conta na lista
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