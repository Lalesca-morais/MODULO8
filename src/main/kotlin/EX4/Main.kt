package EX4

import java.time.LocalDate
fun main() {
    val listaFuncionario = mutableListOf(
        RecursosHumanos("Ana", "financeiro", 1_500.0, LocalDate.of(2011,2,13)),
        RecursosHumanos("Marcela", "administrativo", 3_000.0, LocalDate.of(2020, 8, 10)),
        RecursosHumanos("Lucas", "logística", 1_500.0, LocalDate.of(2019, 10, 5))
    )

    println("Informações dos funcionários:")
    for (funcionario in listaFuncionario) {
        funcionario.exibirInformacoes()
    }

    var continuar = true
    println("------MENU------")
    println("1 - Cadastrar um funcionário")
    println("2 - Listar funcionários cadastrados")
    println("3 - Sair")
    val opcao = readln()?.toInt()

    when (opcao) {
        1 -> {
            while (continuar) {
                println("Digite quantos funcionários deseja cadastrar: ")
                val qtFuncionarios = readLine()?.toIntOrNull() ?: 0

                if (qtFuncionarios != 0) {
                    for (i in 1..qtFuncionarios) {
                        println("Para cadastrar, digite o nome completo do funcionário $i:")
                        val nomeCompleto = readln()

                        println("Digite o setor do funcionário $i:")
                        val setorFuncionario = readln()

                        println("Digite o salário do funcionário $i:")
                        val salarioFuncionario = readln()?.toDoubleOrNull() ?: 0.0

                        println("Digite a data de admissão do funcionário $i (formato: AAAA-MM-DD):")
                        val admissao = readln()

                        val novoFuncionario = RecursosHumanos(nomeCompleto, setorFuncionario, salarioFuncionario, admissao)
                        listaFuncionario.add(novoFuncionario)
                        println("-------------------------------------------------")
                    }
                } else {
                    println("Digite um número válido!")
                }
            }
        }

        2 -> {
            println("Funcionários cadastrados: ")
            for (funcionario in listaFuncionario) {
                funcionario.exibirInformacoes()
            }
        }

        3 -> {
            continuar = false
            println("Saindo do programa...")
        }
        else -> println("Opção inválida!")
    }
}