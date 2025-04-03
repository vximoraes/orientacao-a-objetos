// Controller deve receber serviços e não repositórios via injeção de dependência
class AlunoController(private val alunoService: AlunoService) {
    fun cadastrarAluno(id: String, nome: String, idade: Int, curso: String, nota: Double) {
        val aluno = Aluno(id = Aluno.getIdUnico(), nome = nome, idade = idade, curso = curso, nota = nota)
        alunoService.cadastrarAluno(aluno)
        println("Aluno inserido com sucesso! (Controller)")
    }

    fun listarAlunos() {
        val alunos = alunoService.listarAlunos()
        if (alunos.isEmpty()) {
            println("Nenhum aluno cadastrado.")
        } else {
            alunos.forEach {it.exibirDados()}
            println("Total de alunos cadastrados: ${alunos.size}")
        }
    }

    fun buscarAlunoPeloNome(nome: String) {
        val aluno = alunoService.buscarAlunoPeloNome(nome)
        if (aluno != null) {
            println("\nAluno encontrado:")
            aluno.exibirDados()
        } else {
            println("Aluno não encontrado.")
        }
    }
}