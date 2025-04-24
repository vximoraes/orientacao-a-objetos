import controller.AlunoController
import model.Aluno
import repository.AlunoRepository
import service.AlunoService

fun main() {
    // Instâncias
    val alunoRepository = AlunoRepository()
    val alunoService = AlunoService(alunoRepository)
    val alunoController = AlunoController(alunoService)

    // Simulação de cadastro de aluno
    println("------------------------------------")
    alunoController.cadastrarAluno(id = "1", nome = "Vinícius", idade = 19, curso = "ADS", nota = 9.9)
    alunoController.cadastrarAluno(id = Aluno.getIdUnico(), nome = "Vinícius2", idade = 20, curso = "ADS2", nota = 10.0)
    println("------------------------------------")

    // Listando alunos
    println("------------------------------------")
    alunoController.listarAlunos()
    println("------------------------------------")

    // Buscando aluno pelo nome
    println("------------------------------------")
    alunoController.buscarAlunoPeloNome("Vinícius")
    println("------------------------------------")

    // Buscando aluno pelo id
    println("------------------------------------")
    alunoController.buscarAlunoPeloId("1")
    println("------------------------------------")

    // Atualizar aluno pelo id
    alunoController.alterarAlunoPeloId("1", "Vinícius Atualizado", 20, "Análise e Desenvolvimento de Sistemas", 10.0)
    println("------------------------------------")
    alunoController.listarAlunos()

    // Remover aluno pelo id
    alunoController.deletarAlunoPeloId("1")
    println("------------------------------------")
    alunoController.listarAlunos()
}