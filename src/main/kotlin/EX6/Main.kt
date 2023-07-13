package EX6

fun main() {
    val contaSalario = ContaSalario()
    val contaPoupanca = ContaPoupanca()
    val contaCorrente = ContaCorrente()

//    println("Conta Salário:")
//    contaSalario.deposito(1200.0, true)
//    contaSalario.deposito(500.0)
//    contaSalario.saque(1500.0)
//    contaSalario.saque(100.0)
//
//    println("------------------------")
//
//    println("Conta Poupança:")
//    contaPoupanca.deposito(1000.0, true)
//    contaPoupanca.saque(500.0)
//    contaPoupanca.saque(1500.0)
//
//    println("------------------------")
//
//    println("Conta Corrente:")
//    contaCorrente.deposito(2000.0, true)
//    contaCorrente.saque(1000.0)
//    contaCorrente.saque(3000.0)
    println("=====MENU=====")
    println("1 - Criar conta corrente")
    println("2 - Criar conta poupança")
    println("3 - Criar conta salário")
    println("4 - Sair")
    println("Escolha a opção desejada!")
    val opcao = readln()?.toInt()

    val titularContaCorrente = mutableListOf<String>()
    val titularContaPoupanca = mutableListOf<String>()
    val titularContaSalario = mutableListOf<String>()
    var continuar = true

    while(continuar) {
        when(opcao){
            1 -> {
                println("Digite o nome do titular da conta: ")
                val titular = readln()

                println("Digite o CPF do titular: ")
                val cpfTitular = readln()

                val novoTitular = "$titular\nCPF: $cpfTitular"
                titularContaCorrente.add(novoTitular)

                println("Titulares da conta corrente:")
                for (titular in titularContaCorrente) {
                    println(titular)
                }
            }
            2 -> {
                println("Digite o nome do titular da conta: ")
                val titularPoupanca = readln()

                println("Digite o CPF do titular: ")
                val cpfTitularPoupanca = readln()

                val novoTitularPoupanca = "$titularPoupanca\nCPF: $cpfTitularPoupanca"
                titularContaPoupanca.add(novoTitularPoupanca)

                println("Titulares da conta poupança:")
                for (titular in titularContaPoupanca) {
                    println(titular)
                }
            }
            3 -> {
                println("Digite o nome do titular da conta: ")
                val titularSalario = readln()

                println("Digite o CPF do titular: ")
                val cpfTitularSalario = readln()

                val novoTitularSalario = "$titularSalario\nCPF: $cpfTitularSalario"
                titularContaSalario.add(novoTitularSalario)

                println("Titulares da conta salário:")
                for (titular in titularContaSalario) {
                    println(titular)
                }
            }
            4 -> {
                continuar = false
                println("Encerrando programa...")
                break
            }
            else -> println("Opção inválida!")
        }
    }
}
