package EX3

import java.math.BigDecimal

class Conversor {
    val listaDeCotacoes = mapOf(
        "Dolar Americano" to 4.80,
        "Dolar Canadense" to 3.64,
        "Euro" to 5.37,
        "Libra Esterlina" to 6.20)

    fun converterMoeda(tipoMoeda: String, valorMoeda: BigDecimal): BigDecimal {
        val cotacao = listaDeCotacoes[tipoMoeda]

        if (cotacao == null){
            throw IllegalArgumentException("Tipo de moeda inválido")

        }else if (cotacao.toInt() == 1) {
            return valorMoeda.multiply(BigDecimal(4.80))

        } else if (cotacao.toInt() == 2){
            return valorMoeda.multiply(BigDecimal(3.64))

        }else if(cotacao.toInt() == 3){
            return valorMoeda.multiply(BigDecimal(5.37))

        }else if(cotacao.toInt() == 4){
            return valorMoeda.multiply(BigDecimal(6.20))
        }
        return
    }
}

