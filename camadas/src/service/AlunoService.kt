package service
import model.Aluno

import repository.AlunoRepository

class AlunoService(private val alunoRepository: AlunoRepository) {
    // Create
    fun cadastrarAluno(aluno: Aluno): Aluno {
        // TODO Validações de dados com foco nas regras de negócio

        alunoRepository.cadastrarAluno(aluno)

        return aluno
    }

    // Read
    fun listarAlunos(): List<Aluno> {
        // TODO Validações de dados com foco nas regras de negócio
        return alunoRepository.listarAlunos()
    }

    // Read Nome
    fun buscarAlunoPeloNome(nome: String): Aluno? {
        // TODO Validações de dados com foco nas regras de negócio
        return alunoRepository.buscarAlunoPeloNome(nome)
    }

    // Read Id
    fun buscarAlunoPeloId(id: String): Aluno? {
        // TODO Validações de dados com foco nas regras de negócio
        return alunoRepository.buscarAlunoPeloId(id)
    }

    // Update
    fun alterarAlunoPeloId(aluno: Aluno): Aluno? {
        return alunoRepository.alterarAlunoPeloId(aluno)
    }

    // Delete
    fun deletarAlunoPeloId(id: String): String {
        return alunoRepository.deletarAlunoPeloId(id)
    }
}