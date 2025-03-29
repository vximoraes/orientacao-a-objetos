class Carro(val modelo: String, var cor: String, val potenciaDoMotor: String) {
    var velocidade = 0
        private set

    fun acelerar() {
        if (velocidade < 200) {
            velocidade += 10
        }
    }

    fun desacelerar() {
        if (velocidade > 0) {
            velocidade -= 10
        }
    }

    fun parar() {
        velocidade = 0
    }
}