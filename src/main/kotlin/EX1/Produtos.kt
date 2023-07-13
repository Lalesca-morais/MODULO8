package EX1

import java.time.LocalDate
open class Produtos(val nome: String, val codigoDeBarras: String, val dataValidade: LocalDate) {
    open fun detalhesDoProduto() {
        println("Nome: $nome")
        println("Código de barras: $codigoDeBarras")
        println("Data de validade: $dataValidade")
    }
}
class ValidacaoDoProduto(nome: String, codigoDeBarras: String, dataDeValidade: LocalDate) :
    Produtos(nome, codigoDeBarras, dataDeValidade) {
    override fun detalhesDoProduto() {
        super.detalhesDoProduto()
        println("Data de Validade: $dataValidade")
    }
}


