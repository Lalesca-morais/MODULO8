package EX2

fun main() {
    println("Digite um número (1 a 7) para representar o dia da semana:")
    val numero = readln().toIntOrNull()

    val diaDaSemana = when (numero) {
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Valor inválido"
    }
    println(diaDaSemana)
}

