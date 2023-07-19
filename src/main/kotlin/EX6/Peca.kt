package EX6

abstract class Peca(val marca:String, val modelo:String) {
    abstract fun retirada()
}
class GuardaVolume() {
    private var contador: Int = 1
    private val dicionario: MutableMap<Int, List<Roupas>> = mutableMapOf()

    fun guardarPecas(listaDePecas:ArrayList<Roupas>): Int {
        val identificador = contador++
        dicionario[identificador] = listaDePecas
        return identificador
    }

    fun mostrarPecas() {
        if (dicionario.isEmpty()) {
            println("Guarda-volumes vazio!")
        } else {
            println("-----PEÇAS NO GUARDA VOLUME------")
            for ((identificador, pecas) in dicionario) {
                println("Identificador: $identificador")
                for (peca in pecas) {
                    println("\nMarca: ${peca.marca} \nModelo: ${peca.modelo}")
                    println()
                }
            }
        }
    }

    fun mostrarPecasPorNumeroDeIdentificacao(numero:Int) {
        val pecas = dicionario[numero]

        if (pecas != null) {
            println("Peças referente ao número: $numero")
            for ((index, peca) in pecas.withIndex()) {
                println("Peça ${index + 1}: ${peca.marca} - ${peca.modelo}")
            }
        } else {
            println("Número de Identificação não encontrado.")
        }
    }

    fun devolverPecas(numero: Int) {
        val pecas = dicionario.remove(numero)

        if (pecas != null) {
            println("A peças referente ao número $numero foram devolvidas.")
        } else {
            println("Peça inválida ou não encontrada.")
        }
    }
}