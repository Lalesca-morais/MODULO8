package EX5

import java.time.LocalDate

fun main() {
    val turma = Turma()

    val aluno1 = Aluno(123, "João Silva", LocalDate.of(1995, 5, 15), "M")
    val aluno2 = Aluno(456, "Maria Souza", LocalDate.of(1998, 9, 30), "F")
    val aluno3 = Aluno(789, "Pedro Alves", LocalDate.of(1990, 12, 10), "F")

    turma.cadastrarAluno(aluno1)
    turma.cadastrarAluno(aluno2)
    turma.cadastrarAluno(aluno3)

    turma.listarAlunos()

    turma.listarAlunosPeloSobrenome("Silva")

    turma.listarAlunoMaisVelho()

    val mediaIdade = turma.calcularMediaIdadeAlunos()
    println("Média de idade dos alunos: $mediaIdade")

    val novoAluno = Aluno(456, "Maria da Silva", LocalDate.of(1998, 9, 30), "F")
    turma.atualizarAluno(456, novoAluno)

    turma.removerAluno(789)

    turma.listarAlunos()
}