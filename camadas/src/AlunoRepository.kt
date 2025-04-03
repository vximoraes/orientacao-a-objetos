class AlunoRepository {
    private val alunos = mutableListOf<Aluno>()
    fun cadastrarAluno(aluno:Aluno) {
        alunos.add(aluno)
        println("Aluno ${aluno.nome} cadastrado com sucesso! (Repository)")
        aluno.exibirDados()
    }

    fun listarAlunos(): List<Aluno> {
        return alunos
    }

    fun buscarAlunoPeloNome(nome: String): Aluno? {
        return alunos.find { it.nome == nome }
    }
}