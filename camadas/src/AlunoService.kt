class AlunoService(private val alunoRepository: AlunoRepository) {
    fun cadastrarAluno(aluno: Aluno): Aluno {
        // TODO Validações de dados com foco nas regras de negócio

        alunoRepository.cadastrarAluno(aluno)

        return aluno
    }

    fun listarAlunos(): List<Aluno> {
        // TODO Validações de dados com foco nas regras de negócio
        return alunoRepository.listarAlunos()
    }

    fun buscarAlunoPeloNome(nome: String): Aluno? {
        // TODO Validações de dados com foco nas regras de negócio
        return alunoRepository.buscarAlunoPeloNome(nome)
    }
}