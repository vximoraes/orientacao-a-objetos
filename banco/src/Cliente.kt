class Cliente(val nome: String, val idCliente: String) {
    private var endereco: String = ""

    fun obterNome(): String {
        println("Nome do cliente: ${nome}")
        return nome
    }

    fun definirEndereco(endereco:String) {
        this.endereco = endereco
    }
}