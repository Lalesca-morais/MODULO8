package EX4

import java.time.LocalDate

open class RecursosHumanos(val nomeCompleto: String, val setor: String, val salario: Double, val dataAdmissao: LocalDate) {
    open fun exibirInformacoes() {
        println("Nome completo: $nomeCompleto")
        println("Setor: $setor")
        println("Salário: $salario")
        println("Data de admissão: $dataAdmissao")
        println("------------------------")
    }
}