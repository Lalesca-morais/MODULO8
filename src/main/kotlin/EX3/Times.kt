package EX3

class Times(val nome: String, val jogadores: Int, val vitorias: Int, val esporte: String) {
    fun exibirInformacoes() {
        println("Nome do time: $nome")
        println("Número de jogadores: $jogadores")
        println("Número de vitórias: $vitorias")
        println("Esporte: $esporte")
        println("------------------------")
    }
}