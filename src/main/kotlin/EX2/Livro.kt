package EX2

open class Livro(val genero: String, val nomeDoLivro: String, val autorDoLivro: String) {
    open fun detalhesDoProduto() {
        println("Nome do livro: $nomeDoLivro")
        println("Gênero: $genero")
        println("Autor(a) do livro: $autorDoLivro")
    }
}
