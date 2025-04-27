import java.util.Date
import java.util.UUID

class Transacao(val valor: Double, val data: Date) {
    // Atributo privado para garantir que o identificador único da transação não seja alterado externamente
    val idTransacao: String = UUID.randomUUID().toString()

    // Método público para executar a transação, registrando as informações
    fun executar(tipo: String): Boolean {
        println("ID: ${idTransacao} - Valor: ${valor} - Tipo: ${tipo} ")
        return true
    }
}