import java.util.UUID

class Aluno(val id: String, val nome: String, val idade: Int, val curso: String, val nota: Double, idPessoa: Int) : Pessoa(idPessoa) {
    fun exibirDados() {
        println("ID: $id")
        println("Nome: $nome")
        println("Idade: $idade")
        println("Curso: $curso")
        println("Nota: $nota")
    }

    companion object {
        fun getIdUnico(): String {
            return UUID.randomUUID().toString()
        }
    }

    override fun adicionarPessoa(): String {
        return "Pessoa adicionada... (aluno)"
    }

    override open fun listarPessoa(): String {
        return "Listando pessoa... (aluno)"
    }

    override open fun atualizarPessoa(): String {
        return "Pessoa atualizada... (aluno)"
    }

    override open fun deletarPessoa(): String {
        return "Pessoa deletada... (aluno)"
    }
}