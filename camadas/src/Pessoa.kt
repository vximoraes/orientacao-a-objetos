open class Pessoa(val idPessoa: Int) {
    open fun adicionarPessoa(): String {
        return "Pessoa adicionada..."
    }

    open fun listarPessoa(): String {
        return "Listando pessoa..."
    }

    open fun atualizarPessoa(): String {
        return "Pessoa atualizada..."
    }

    open fun deletarPessoa(): String {
        return "Pessoa deletada..."
    }
}