package EX2

fun main() {
    val livros = mutableListOf(
        Livro("Fantasia", "O Senhor dos Anéis", "J.R.R. Tolkien"),
        Livro("Romance", "Orgulho e Preconceito", "Jane Austen"),
        Livro("Ficção Científica", "Duna", "Frank Herbert"),
        Livro("Romance", "Um dia", "David Nicholls"),
        Livro("Romance", "A Viajante no Tempo", "Diana Gabaldon")
    )
    println("Livros cadastrados: ")
    for (livro in livros) {
        println("Nome do livro: ${livro.nomeDoLivro}")
        println("Gênero: ${livro.genero}")
        println("Autor(a) do livro: ${livro.autorDoLivro}")
        println("----------------------------------------")
    }
    var continuar = true
    println("------MENU------")
    println("1 - Cadastrar um livro")
    println("2 - Listar livros cadastrados")
    println("3 - Sair")
    val opcao = readln().toInt()

    when (opcao) {
        1 -> {
            while (continuar) {
                println("Digite quantos livros deseja cadastrar: ")
                val qtLivros = readln()?.toInt()

                if (qtLivros != 0) {
                    for (i in 1..qtLivros!!) {
                        println("Para cadastrar digite o gênero do livro $i:")
                        val generoLivro = readLine()

                        println("Digite o nome do livro $i:")
                        val nomeLivro = readLine()

                        println("Digite o autor(a) do livro $i:")
                        val autorLivro = readLine()

                        val novoLivro = Livro(generoLivro, nomeLivro, autorLivro)
                         livros.add(novoLivro)
                        println("-------------------------------------------------")
                    }
                } else println("Digite um número válido!")
            }
        }
        2 -> {
            println("Livros cadastrados: ")
            for (livro in livros) {
                println("Nome do livro: ${livro.nomeDoLivro}")
                println("Gênero: ${livro.genero}")
                println("Autor(a) do livro: ${livro.autorDoLivro}")
                println("-------------------------------------------")
            }
        }
        3 -> {
            continuar = false
            println("Saindo do programa...")
        }
        else -> println("Opção inválida!")
    }
}

