package EX2

import java.time.LocalDate

fun main() {
    val albertEinstein = Pessoa()
    albertEinstein.nome = "Albert Einstein"
    albertEinstein.ajustaDataDeNascimento(14,3,1879)

    val isaacNewton = Pessoa()
    isaacNewton.nome = "Isaac Newton"
    isaacNewton.ajustaDataDeNascimento(4,1,1643)

    val dataHoje = LocalDate.now()

    albertEinstein.calculaIdade(dataHoje.dayOfMonth, dataHoje.monthValue, dataHoje.year)
    isaacNewton.calculaIdade(dataHoje.dayOfMonth, dataHoje.monthValue, dataHoje.year)

    println("${albertEinstein.informaNome()}: ${albertEinstein.informaIdade()} anos")
    println()
    println("${isaacNewton.informaNome()}: ${isaacNewton.informaIdade()} anos")
}
