package EX3

class Dicionario(){

    fun adicionarTermo(dicionario: MutableMap<String, String>) {
        println("Digite o termo que deseja adicionar: ")
        val termo = readln()

        if (dicionario.containsKey(termo)) {
            println("Termo já existente no dicionário")
        } else {
            println("Digite o significado do termo: ")
            val significado = readln()
            dicionario[termo] = significado
            println("Termo '$termo' adicionado ao dicionário com sucesso.")
        }
    }
    fun procurarTermo(dicionario: MutableMap<String, String>){
        println("Digite o termo que deseja procurar: ")
        val termoProcurado = readln()

        if (dicionario.containsKey(termoProcurado)) {
            val significado = dicionario[termoProcurado]
            println("Significado do termo: $termoProcurado: $significado")
        } else {
            println("Termo '$termoProcurado' não exste no didionário!")
        }
    }
    fun listarTermos(dicionario: MutableMap<String, String>){
        println("Termos em ordem alfabética: ")
        for ((termo, significado) in dicionario) {
            println("$termo: $significado")
        }
    }
}