//package EX4
//
//fun main() {
//    var habitantes = mutableMapOf<String, Habitante>()
//    var habitante = Habitante("","")
//
//    do {
//        println("""
//            =====MENU DE OPÇÕES=====
//            1 - Cadastrar habitante
//            2 - Mostrar informações cadastradas de um habitante
//            3 - Mostrar salários cadastrados de um habitante
//            4 - Calcular imposto de um habitante
//            5 - Sair
//            Escolha a opção desejada!
//        """)
//        val opcao = readln().toIntOrNull()
//
//        when (opcao) {
//            1 -> habitante.cadastrarHabitante(habitantes)
//            2 -> habitante.mostrarInformacoes(habitantes)
//            3 -> habitante.mostrarSalarios(habitantes) //erro na opcao 3
//            4 -> habitante.calcularImposto(habitantes)
//            5 -> {
//                println("Encerrando o sistema...")
//                return
//            }
//            else -> println("Opção inválida!")
//        }
//    } while (true)
//}