open class Pessoa(val nome: String, val idade: Int) {
    fun apresentar() {
        if(idade < 0) {
            println("Idade inválida.")
        } else if(idade >= 18) {
            println("Olá, ${nome}! Você tem ${idade} anos, logo, já pode trabalhar no Pela Bank!")
        } else {
            val anosFaltando = 18 - idade
            println("Olá, ${nome}! Você tem ${idade} anos, logo, ainda faltam ${anosFaltando} anos para você poder trabalhar no Pela Bank...")
        }
    }
}