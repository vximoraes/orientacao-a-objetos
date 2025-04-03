fun main() {
    // Instâncias
    val alunoRepository = AlunoRepository()
    val alunoService = AlunoService(alunoRepository)
    val alunoController = AlunoController(alunoService)

    // Simulação de cadastro de aluno
    alunoController.cadastrarAluno(id = Aluno.getIdUnico(), nome = "Vinícius", idade = 19, curso = "ADS", nota = 9.9)
    alunoController.cadastrarAluno(id = Aluno.getIdUnico(), nome = "Vinícius2", idade = 20, curso = "ADS2", nota = 10.0)

    // Listando alunos
    alunoController.listarAlunos()

    // Buscando aluno pelo nome
    alunoController.buscarAlunoPeloNome("Vinícius")
}