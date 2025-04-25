package repository
import models.Aluno

class AlunoRepository {
    private val alunos = mutableListOf<Aluno>()

    // Create
    fun cadastrarAluno(aluno: Aluno) {
        alunos.add(aluno)
        println("Aluno ${aluno.nome} cadastrado com sucesso! (Repository)")
        aluno.exibirDados()
    }

    // Read
    fun listarAlunos(): List<Aluno> {
        return alunos
    }

    // Read Nome
    fun buscarAlunoPeloNome(nome: String): Aluno? {
        return alunos.find { it.nome == nome }
    }

    // Read Id
    fun buscarAlunoPeloId(id: String): Aluno? {
        return alunos.find { it.idPessoa == id }
    }

    // Update Id
    fun alterarAlunoPeloId(aluno: Aluno): Aluno? {
        val alunoRemover = alunos.find { it.idPessoa == aluno.idPessoa }

        if (alunoRemover == null) {
            println("Nenhum aluno encontrado pelo id '${aluno.idPessoa}' (Repository)")
        } else {
            alunos.remove(alunoRemover)
            alunos.add(aluno)
        }

        return aluno
    }

    // Delete Id
    fun deletarAlunoPeloId(id: String): String {
        val alunoDeletar = alunos.find { it.idPessoa == id }

        if (alunoDeletar == null) {
            return "Nenhum aluno encontrado pelo id '${id}' (Repository)"
        } else {
            alunos.remove(alunoDeletar)
            return "Aluno com id '${id}' deletado com sucesso"
        }
    }
}