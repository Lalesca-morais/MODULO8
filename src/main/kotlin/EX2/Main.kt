package EX2

fun main() {
    val diaDaSemana=DiaDaSemana()

    println("Digite um número de 1 a 7:")
    val numero = readln().toIntOrNull()

    diaDaSemana.mostrarDiaDaSemana(numero)
}