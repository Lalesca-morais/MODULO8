package EX1

abstract class Produto(val codigoDeBarras: String, val nome: String, val preco: Double) {
     open fun mostrarDetalhesDoItem() {
        println("Nome: $nome")
        println("Código de barras: $codigoDeBarras")
        println("Preço: $preco")
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Produto) return false
        return codigoDeBarras == other.codigoDeBarras
    }
}

class Livros(codigoBarras: String, nome: String, preco: Double, val autor: String): Produto(codigoBarras, nome, preco) {
    override fun mostrarDetalhesDoItem() {
        println("Autor: $autor")
    }
}

class CDs(codigoBarras: String, nome: String, preco: Double, val numeroFaixas: Int): Produto(codigoBarras, nome, preco){
    override fun mostrarDetalhesDoItem() {
        println("Número de faixas: $numeroFaixas")
    }
}

class DVDs(codigoBarras: String, nome: String, preco: Double, val duracao: Int) : Produto(codigoBarras, nome, preco) {
    override fun mostrarDetalhesDoItem() {
        println("Duração: $duracao minutos")
    }
}

