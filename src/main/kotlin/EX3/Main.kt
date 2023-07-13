package EX3

fun main() {
    val time1 = Times("Time A", 15, 5, "Futebol")
    val time2 = Times("Time B", 10, 3, "Basquete")
    val time3 = Times("Time C", 12, 7, "Vôlei")

    println("Informações dos times:")
    time1.exibirInformacoes()
    time2.exibirInformacoes()
    time3.exibirInformacoes()
}