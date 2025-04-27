class Banco(val nome: String) {
    // Atributo privado para proteger a lista de agências, garantindo que apenas métodos da classe possam manipulá-la
    private var agencias = mutableListOf<Agencia>()

    // Método público para adicionar uma agência à lista
    fun adicionarAgencia(agencia: Agencia) {
        agencias.add(agencia)
        println("Agência ${agencia.nome} adicionada com sucesso!")
    }

    // Método público para remover uma agência da lista
    fun removerAgencia(agencia: Agencia) {
        val agenciaDeletar = agencias.find { it.nome == agencia.nome }

        if (agenciaDeletar == null) {
            println("Nenhuma agência encontrada.")
        } else {
            agencias.remove(agenciaDeletar)
            println("Agência '${agencia.nome}' deletada com sucesso!")
        }
    }

    // Método público para buscar uma agência na lista
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