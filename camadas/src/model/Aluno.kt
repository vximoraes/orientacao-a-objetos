package model

import java.util.UUID

class Aluno(val id: String, val nome: String, val idade: Int, val curso: String, val nota: Double, idPessoa: String) : Pessoa(idPessoa) {
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
        return "model.Pessoa adicionada... (aluno)"
    }

    override open fun listarPessoa(): String {
        return "Listando pessoa... (aluno)"
    }

    override open fun atualizarPessoa(): String {
        return "model.Pessoa atualizada... (aluno)"
    }

    override open fun deletarPessoa(): String {
        return "model.Pessoa deletada... (aluno)"
    }
}