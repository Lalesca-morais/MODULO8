package EX2

import java.lang.NumberFormatException

class Compras {
    val listaDeVerduras = mutableListOf<Double>()
    val listaDeLegumes = mutableListOf<Double>()
    val listaDeGraos = mutableListOf<Double>()
    val outros = mutableListOf<Int>()

    fun verduras() {
        while (true) {
            try {
                println("Digite a quantidade em gramas que deseja: ")
                val qtVerduras = readln()

                if (qtVerduras == "") {
                    throw UnsupportedOperationException("Quantidade de gramas não pode ser vazia!")
                }
                val verduraAdicionada = qtVerduras.toDouble()
                listaDeVerduras.add(verduraAdicionada)
                println("Gramas: $verduraAdicionada")
            } catch (e: NumberFormatException) {
                println("Para verdura, a quantidade deve ser informada com ponto.")
            }
        }
    }

    fun graos() {
        while (true) {
            try {
                println("Digite a quantidade em gramas que deseja: ")
                val qtGraos = readln()

                if (qtGraos == "") {
                    throw UnsupportedOperationException("Quantidade de gramas não pode ser vazia!")
                }
                val graoAdicionado = qtGraos.toDouble()
                listaDeGraos.add(graoAdicionado)
                println("Gramas: $graoAdicionado")
            } catch (e: NumberFormatException) {
                println("Para grãos, a quantidade deve ser informada com ponto.")
            }
        }
    }

    fun legumes() {
        while (true) {
            try {
                println("Digite a quantidade em unidades que deseja: ")
                val qtLegumes = readln()

                if (qtLegumes == "") {
                    throw UnsupportedOperationException("Quantidade de unidades não pode ser vazia!")
                }
                val legumeAdicionado = qtLegumes.toDouble()
                listaDeLegumes.add(legumeAdicionado)
                println("Unidades: $legumeAdicionado")
            } catch (e: NumberFormatException) {
                println("Para legume, a quantidade deve ser informada unidades inteiras.")
            }
        }
    }

    fun adicionarOutro() {
        while (true) {
            try {
                println("Digite a quantidade em unidades que deseja: ")
                val qtOutros = readln()

                if (qtOutros == "") {
                    throw UnsupportedOperationException("Não é permitido inserir valor vazio.")
                }
                val outroAdicionado = qtOutros.toInt()
                outros.add(outroAdicionado)
                println("Unidades: $outroAdicionado")
            } catch (e: NumberFormatException) {
                println("Para outros, a quantidade deve ser informada em unidades inteiras.")
            }
        }
    }
}
