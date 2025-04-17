import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite seu nome: ")
    val nome = scanner.nextLine()
    print("Digite sua idade: ")
    val idade = scanner.nextInt()

    val pessoa = Pessoa(nome, idade)
    pessoa.apresentar()
}