package EX3

fun main() {
    val dicionario = mutableMapOf<String, String>()
    val novoDicionario = Dicionario()

    do {
        print("""
       -----MENU DE OPÇÕES-----
       1 - Adicionar termo ao dicionário
       2 - Procurar termo no dicionário
       3 - Listar todos os termos existentes em ordem alfabética
       4 - Sair
       Escolha a opção desejada!
    """)
        val opcao = readln().toIntOrNull()

        when(opcao){
            1 -> novoDicionario.adicionarTermo(dicionario)
            2 -> novoDicionario.procurarTermo(dicionario)
            3 -> novoDicionario.listarTermos(dicionario)
            4 -> {
                println("Encerrando ptograma...")
                return
            }
            else -> println("Opção inválida!")

        }
    } while(true)
}