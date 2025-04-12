// Controller deve receber serviços e não repositórios via injeção de dependência
class AlunoController(private val alunoService: AlunoService) {
    // Create
    fun cadastrarAluno(id: String, nome: String, idade: Int, curso: String, nota: Double) {
        val aluno = Aluno(
            id = id, nome = nome, idade = idade, curso = curso, nota = nota,
            idPessoa = TODO()
        )
        alunoService.cadastrarAluno(aluno)
        println("Aluno inserido com sucesso! (Controller)")
    }

    // Read
    fun listarAlunos() {
        val alunos = alunoService.listarAlunos()
        if (alunos.isEmpty()) {
            println("Nenhum aluno cadastrado.")
        } else {
            alunos.forEach {it.exibirDados()}
            println("\nTotal de alunos cadastrados: ${alunos.size}")
        }
    }

    // Read Nome
    fun buscarAlunoPeloNome(nome: String) {
        val aluno = alunoService.buscarAlunoPeloNome(nome)
        if (aluno != null) {
            println("Aluno com nome '${aluno.nome}'")
            aluno.exibirDados()
        } else {
            println("Aluno não encontrado.\n")
        }
    }

    // Read Id
    fun buscarAlunoPeloId(id: String) {
        val aluno = alunoService.buscarAlunoPeloId(id)
        if (aluno != null) {
            println("Aluno com id '${aluno.id}'")
            aluno.exibirDados()
        } else {
            println("Aluno não encontrado.")
        }
    }

    // Update
    fun alterarAlunoPeloId(id: String, nome: String, idade: Int, curso: String, nota: Double) {
        val aluno = Aluno(
            id, nome, idade, curso, nota,
            idPessoa = TODO()
        )
        alunoService.alterarAlunoPeloId(aluno)
    }

    // Delete
    fun deletarAlunoPeloId(id: String) {
        alunoService.deletarAlunoPeloId(id)
    }
}