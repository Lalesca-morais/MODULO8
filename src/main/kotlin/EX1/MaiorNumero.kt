package EX1


class MaiorNumero {

    fun encontrarMaisBarato(valor1: Double?, valor2: Double?, valor3: Double?, valor4: Double?, valor5: Double?): String {

        if (valor1 != null && valor2 != null && valor3 != null && valor4 != null && valor5 != null) {

            if (valor1 > 0 && valor2 > 0 && valor3 > 0) {
                val menorNumero = minOf(valor1, valor2, valor3)

                when {
                    valor1 == menorNumero -> {
                        return "O primeiro produto é o mais barato"
                    }

                    valor2 == menorNumero -> {
                        return "O segundo produto é o mais barato"
                    }

                    valor3 == menorNumero -> {
                        return "O terceiro produto é o mais barato"
                    }

                    else -> println("Valor inválido")
                }
            }
        }else {
            println("Não é permitido números nulos")
        }
        return "Não é permitido números nulos"
    }
}