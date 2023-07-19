package EX5

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Aluno(val matricula: Int, val nome: String, val dataNascimento: LocalDate, val sexo: String) {
    override fun toString(): String {
        val dataFormatada = dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        return "Matrícula: $matricula, Nome: $nome, Data de Nascimento: $dataFormatada, Sexo: $sexo"
    }
}