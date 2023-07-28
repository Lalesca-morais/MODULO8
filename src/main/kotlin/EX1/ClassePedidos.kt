package EX1

import java.util.*

class ClassePedidos {
    companion object {
        private val precos = mapOf("maçã" to 60, "laranja" to 25)

        fun calcularTotal(pedidos: List<String>): String {

            var produtoComDesconto = mutableMapOf<String, Int>()

            var totalCentavos = 0

            for (pedido in pedidos) {

                val preco = precos[pedido.lowercase(Locale.getDefault())]

                if (preco != null) {
                    totalCentavos += preco
                    produtoComDesconto[pedido] = produtoComDesconto.getOrDefault(pedido, 0) + 1
                } else {
                    throw IllegalArgumentException("Produto não encontrado: $pedido")
                }
            }
            val maca = produtoComDesconto["maca"] ?: 0
            totalCentavos -= (maca / 2) * 60

            val laranja = produtoComDesconto["laranja"] ?: 0
            totalCentavos -= (laranja / 3) * 25

            return formatarValor(totalCentavos)
        }

        fun formatarValor(valorCentavos: Int): String {
            val reais = valorCentavos / 100
            val centavos = valorCentavos % 100
            return "$$reais.${centavos.toString().padStart(2, '0')}"
        }
    }
}


