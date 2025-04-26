import java.util.Date
import java.util.UUID

class Transacao(val valor: Double, val data: Date) {
    val idTransacao: String = UUID.randomUUID().toString()

    fun executar(tipo: String): Boolean {
        println("ID: ${idTransacao} - Valor: ${valor} - Tipo: ${tipo} ")
        return true
    }
}