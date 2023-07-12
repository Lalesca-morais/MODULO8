package EX1

class Produto(private val nome: String, private val valor: Double, private val quantidade: Int) {
    fun getNome(): String {
        return nome
    }

    fun getValor(): Double {
        return valor
    }

    fun getQuantidade(): Int {
        return quantidade
    }
}
class Caixa {
    val listaProdutos = mutableListOf<Produto>()

    fun cadastrarProdutos(produto: Produto) {
        listaProdutos.add(produto)
        println("--------------------------------")
        println("Produto cadastrado com sucesso!")
    }

    fun exibirProdutosCadastrados() {

        if (!listaProdutos.isEmpty()) {
            println("=====PRODUTOS CADASTRADOS=====")
            listaProdutos.forEach { println("\nNome: ${it.getNome()}\nValor: R$ ${it.getValor()}\nQuantidade: ${it.getQuantidade()}")
                println()
        }
        }else {
            println("Não foi cadastrado nenhum produto na lista")
        }
    }

    fun somaDeTodosOsValores(): Double {
        var total = 0.0
        for (produto in listaProdutos) {
            total += produto.getValor() * produto.getQuantidade()
        }
        return total
    }
}