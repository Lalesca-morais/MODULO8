package EX2

fun main() {
    var novaCompra = Compras()

    println("""
       Escolha o tipo de alimento que deseja cadastrar:
        1 - Verdura
        2 - Legumes
        3 - Grãos
        4 - Outros
        5 - Sair
         """)

    while (true) {
        when (val escolha = readln().toIntOrNull()) {
            1 -> novaCompra.verduras()
            2 -> novaCompra.legumes()
            3 -> novaCompra.graos()
            4 -> novaCompra.outros()
            5 -> {
                println("Encerrando programa...")
                break
            }
            else -> println("Opção inválida, tente novamente.")
        }
    }
}
