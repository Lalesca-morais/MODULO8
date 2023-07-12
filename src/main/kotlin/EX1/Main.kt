package EX1

import java.util.*
fun main() {

    val caixa = Caixa()
    val scanner = Scanner(System.`in`)

    val item1 = Produto("Arroz", 1.99, 2)
    val item2 = Produto("Feijão", 2.99, 1)
    val item3 = Produto("Macarrão", 3.99, 2)
    val item4 = Produto("Óleo", 4.99, 3)
    val item5 = Produto("Açúcar", 5.99, 1)

    println("---------MENU--------")
    println("1 - Cadastrar Produtos")
    println("2 - Exibir produtos cadastrados")
    println("3 - Exibir valor total")
    println("4 - Sair")
    println("Escolha a opção desejada")
    var opcao = scanner.nextInt()

    var continuar = true

    try {
        while (continuar) {

            when (opcao) {

                1 -> {
                    print("Digite o nome do produto: ")
                    val nome = scanner.next()
                    print("Digite o valor do produto: ")
                    val valor = scanner.nextDouble()
                    print("Digite a quantidade do produto: ")
                    val quantidade = scanner.nextInt()

                    val produto = Produto(nome, valor, quantidade)
                    caixa.cadastrarProdutos(produto)
                }
                2 -> {
                    caixa.exibirProdutosCadastrados()
                }
                3 -> {
                    val valorTotal = caixa.somaDeTodosOsValores()
                    println("Valor total a pagar: R$ $valorTotal")
                }
                4 -> {
                    continuar = false
                    println("Encerrando programa...")
                }
                else -> println("Digite uma opção válida!")
            }
            if (continuar) {
                println("---------MENU--------")
                println("1 - Cadastrar Produtos")
                println("2 - Exibir produtos cadastrados")
                println("3 - Exibir valor total")
                println("4 - Sair")
                println("Escolha a opção desejada")
                opcao = scanner.nextInt()
            }
        }
    }catch (e: NumberFormatException) {
        println("Digite um número válido")
    }
}

