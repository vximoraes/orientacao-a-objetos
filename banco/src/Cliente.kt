class Cliente(val nome: String, val idCliente: String) {
    // Atributo privado para evitar acesso direto ao endereço, permitindo apenas modificações controladas
    private var endereco: String = ""

    // Método público para obter o nome do cliente
    fun obterNome(): String {
        println("Nome do cliente: ${nome}")
        return nome
    }

    // Método público para definir o endereço, permitindo que o valor seja alterado através de um método
    fun definirEndereco(endereco:String) {
        this.endereco = endereco
    }
}