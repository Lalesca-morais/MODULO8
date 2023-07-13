package EX1

import java.lang.Exception
import java.time.LocalDate
fun main() {
    val produto1 = ValidacaoDoProduto("Arroz", "7891234567890", LocalDate.of(2023, 12, 31))
    val produto2 = Produtos("Feijão", "9876543210987", LocalDate.of(2023,7,12))

    val listaDeProdutos = mutableListOf<Produtos>(produto1, produto2)

    println("Produtos cadastrados:")
    for (produto in listaDeProdutos) {
        produto.detalhesDoProduto()
        println("------------------------")
    }
    println("Digite quantos produtos deseja cadastrar: ")
    val qtProdutos = readln().toIntOrNull() ?:0

    for (i in 1..qtProdutos){
        println("Para cadastrar digite o nome do produto $i:")
        val nome = readln() ?: ""

        println("Digite o código de barras do produto $i: ")
        val codigoDeBarras = readln() ?: ""

        println("Digite a data de validade do produto $i (formato: AAAA-MM-DD): ")
        val novaDataDeValidade = readln() ?: ""

        val dataDeValidade = try {
            LocalDate.parse(novaDataDeValidade)
        }catch (e: Exception){
            LocalDate.now()
        }
        val produto = Produtos(nome, codigoDeBarras, dataDeValidade)
        listaDeProdutos.add(produto)
        println("-------------------------------------------------")
    }
    println("Produtos cadastrados: ")
    for (produto in listaDeProdutos) {
        println("Nome: ${produto.nome}")
        println("Código de barras: ${produto.codigoDeBarras}")
        println("Data de validade: ${produto.dataValidade}")
        println("-------------------------------------------")
    }
}


