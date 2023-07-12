package EX3

import java.lang.IllegalArgumentException
import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    var continuar = true

    while (continuar) {
        val aluno = Aluno()

        try {
            print("Digite a nota da primeira avaliação: ")
            val nota1 = scanner.nextDouble()
            aluno.setNota1(nota1)

            print("Digite a nota da segunda avaliação: ")
            val nota2 = scanner.nextDouble()
            aluno.setNota2(nota2)

            print("Digite a nota da terceira avaliação: ")
            val nota3 = scanner.nextDouble()
            aluno.setNota3(nota3)

            print("Digite a nota da quarta avaliação: ")
            val nota4 = scanner.nextDouble()
            aluno.setNota4(nota4)

            val media = aluno.calculoMediaSemestral()
            println("Média semestral: $media")

        } catch (e: IllegalArgumentException) {
            println(e.message)
            continue
        }

        var novoCalculo: Int
        do {
            println("Novo cálculo (1 - Sim  2 - Não)?")
            novoCalculo = scanner.nextInt()

        } while (novoCalculo != 1 && novoCalculo != 2)

        continuar = novoCalculo == 1
    }
}