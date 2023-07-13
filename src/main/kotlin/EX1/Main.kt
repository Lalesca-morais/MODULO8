package EX1

fun main() {
    val produtos = arrayOf(
        Livros("123456", "Livro A", 29.99, "Autor A"),
        CDs("234567", "CD B", 19.99, 12),
        DVDs("345678", "DVD C", 39.99, 120),
        Livros("1234512", "Livro B", 39.90, "Autor B"),
        CDs("876547", "CD C", 15.99, 12)
    )

    for (produto in produtos) {
        println("Produto: ")
        produto.mostrarDetalhesDoItem()
        println("------------------------")
    }
    val produtoBuscadoErrado = Livros("876543", "Livro E", 0.99, "Autor K")
    buscarProduto(produtoBuscadoErrado, produtos)

    val produtoBuscadoCerto = DVDs("345678", "DVD C", 39.99, 120)
    buscarProduto(produtoBuscadoCerto, produtos)
}
private fun buscarProduto(produto: Produto, produtos: Array<Produto>) {
    val posicao = produtos.indexOf(produto)

    if (posicao != -1) {
        println("O produto ${produto.nome} está na posição $posicao do vetor.")
    } else {
        println("O produto ${produto.nome} não foi encontrado.")
    }
}






