package EX1

fun main() {
    val produtosDaLoja = arrayOf(
        Livros("345578", "Livro 1", 19.99, "Autor 1"),
        Livros("789012", "Livro 2", 19.99, "Autor 2"),
        CDs("123456", "CD 1", 9.99, 12)
    )

    for (produto in produtosDaLoja) {
        println("Produto: ")
        produto.mostrarDetalhesDoItem()
        println("------------------------")
    }
    val produto1 = produtosDaLoja[0]
    val produto2 = produtosDaLoja[1]
    val produto3 = produtosDaLoja[2]

    println(produto1 == produto1)
    println(produto1 == produto3)
}






