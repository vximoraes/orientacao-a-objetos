class Banco(val nome: String) {
    private var agencias = mutableListOf<Agencia>()

    fun adicionarAgencia(agencia: Agencia) {
        agencias.add(agencia)
        println("Agência ${agencia.nome} adicionada com sucesso!")
    }

    fun removerAgencia(agencia: Agencia) {
        val agenciaDeletar = agencias.find { it.nome == agencia.nome }

        if (agenciaDeletar == null) {
            println("Nenhuma agência encontrada.")
        } else {
            agencias.remove(agenciaDeletar)
            println("Agência '${agencia.nome}' deletada com sucesso!")
        }
    }

    fun obterAgencia(nome: String): Agencia? {
        val agenciaEncontrada = agencias.find { it.nome == nome }
        if (agenciaEncontrada != null) {
            println("Agência(s) com nome '${agenciaEncontrada.nome}'")

        } else {
            println("Agência não encontrada.")
        }

        return agenciaEncontrada
    }
}