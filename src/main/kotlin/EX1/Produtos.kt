package EX1

abstract class Produto(val codigoDeBarras: String, val nome: String, val preco: Double) {
    open fun mostrarDetalhesDoItem() {
        println("Nome: $nome")
        println("Código de barras: $codigoDeBarras")
        println("Preço: $preco")
    }
    open fun equals(outroValor: Produto?): Boolean {
        if (this === outroValor){
            return true
        }else if (outroValor !is Produto) {
            return false
        }
        return codigoDeBarras == outroValor.codigoDeBarras
    }
}
class Livros(codigoBarras: String, nome: String, preco: Double, val autor: String): Produto(codigoBarras, nome, preco) {
    override fun mostrarDetalhesDoItem() {
        super.mostrarDetalhesDoItem()
        println("Autor: $autor")
    }
}
class CDs(codigoBarras: String, nome: String, preco: Double, val numeroFaixas: Int): Produto(codigoBarras, nome, preco){
    override fun mostrarDetalhesDoItem() {
        super.mostrarDetalhesDoItem()
        println("Número de faixas: $numeroFaixas")
    }
}
class DVDs(codigoBarras: String, nome: String, preco: Double, val duracao: Int) : Produto(codigoBarras, nome, preco) {
    override fun mostrarDetalhesDoItem() {
        super.mostrarDetalhesDoItem()
        println("Duração: $duracao minutos")
    }
}

