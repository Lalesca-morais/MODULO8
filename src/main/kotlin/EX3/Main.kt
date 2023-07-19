package EX3


fun main() {
    val novoConversor = Conversor()
    while (true) {
        println("""
        -----Boas vindas ao conversor de moedas-----
           Digite a moeda você deseja converter: 
           1 - Dólar Americano
           2 - Dólar Canadense
           3 - Euro
           4 - Libra Esterlina
           5 - Sair""")
        val tipoMoedaEscolhido = readln()
        while (true) {
            when(tipoMoedaEscolhido){
                1 -> novoConversor.converterMoeda(tipoMoedaEscolhido,0)
                2 -> novoConversor.converterMoeda(tipoMoedaEscolhido, 0)
                3 -> novoConversor.converterMoeda(tipoMoedaEscolhido, 0)
                4 -> novoConversor.converterMoeda(tipoMoedaEscolhido, 0)
                5 -> {
                    println("Encerrando programa...")
                    break
                }
            }
        }
    }
}
