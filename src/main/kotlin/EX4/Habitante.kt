//package EX4
//
//class Habitante(var nome: String, var profissao: String) {
//    val salarioMensal = mutableMapOf<Int, Double>()
//
//    fun mostrarInformacoes() {
//        println("Nome: $nome")
//        println("Profissão: $profissao")
//        //println("Salário: $salarioNoMes")
//    }
//
//    fun mostrarSalarios() {
//        if (salarioMensal.isEmpty()){
//            println("Não há salários cadastrados ainda!")
//        }else {
//            for ((mes, salario) in salarioMensal) {
//                println("Mês: $mes Salário = R$ ${"%.2f".format(salario)}")
//            }
//        }
//   }
//
//    fun cadastrarHabitante(habitantes: MutableMap<String, Habitante>) {
//        print("Digite o nome do habitante: ")
//        val nome = readln()
//
//        print("Digite a profissão do habitante: ")
//        val profissao = readln()
//
//        for (mes in 1..12) {
//            println("Digite o salário do mês $mes")
//            val salarioNoMes = readln().toDoubleOrNull()
//
//            if (salarioNoMes != null) {
//                salarioMensal[mes] = salarioNoMes
//            } else {
//                println("Digite um número válido!")
//            }
//        }
//        val habitante = Habitante(nome, profissao)
//        habitantes[nome] = habitante
//        println("Habitante cadastrado com sucesso!")
//    }
//
//    fun mostrarInformacoes(habitantes: MutableMap<String, Habitante>) {
//        print("Digite o nome do habitante: ")
//        val nome = readln()
//
//        val habitante = habitantes[nome]
//        if (habitante != null) {
//            habitante.mostrarInformacoes()
//        } else {
//            println("Habitante não encontrado.")
//        }
//    }
//
//    fun mostrarSalarios(habitantes: MutableMap<String, Habitante>) {
//        print("Digite o nome do habitante: ")
//        val nome = readln()
//
//        val habitante = habitantes[nome]
//        if (habitante != null) {
//            habitante.mostrarSalarios()
//        } else {
//            println("Habitante não encontrado.")
//        }
//    }
//
//    fun calcularImposto(habitantes: MutableMap<String, Habitante>) {
//        print("Digite o nome do habitante: ")
//        val nome = readln()
//
//        val habitante = habitantes[nome]
//        if (habitante != null) {
//            for ((mes, salarioNoMes) in salarioMensal) {
//                val imposto = when (salarioNoMes) {
//                    in 0.00..2000.00 -> 0.00
//                    in 2001.00..3000.00 -> salarioNoMes * 0.08
//                    in 3001.00..4500.00 -> salarioNoMes * 0.18
//                    else -> salarioNoMes * 0.28
//                }
//                println("Mês $mes - Imposto = R$ ${"%.2f".format(imposto)}")
//            }
//        } else {
//            println("Habitante não encontrado.")
//        }
//    }
//}