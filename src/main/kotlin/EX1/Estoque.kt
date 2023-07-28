package EX1

import java.util.*


class Estoque {
    companion object {

        private val estoque = mutableMapOf<String, Int>()

        init {
            estoque["maçã"] = 10
            estoque["laranja"] = 10
        }

        fun atualizarEstoque(produto: String, quantidade: Int) {
            val estoqueAtual = estoque[produto] ?: 0
            estoque[produto] = estoqueAtual - quantidade
        }

        fun verificarEstoqueSuficiente(produto: String, quantidade: Int): Boolean {
            val estoqueAtual = estoque[produto] ?: 0
            return estoqueAtual >= quantidade
        }
    }
}

class PedidoService(val estoque: Estoque, val notificacao: Notificacao) {
    companion object {
        private val precos = mapOf("maçã" to 60, "laranja" to 25)

        fun processarPedido(pedido: List<String>, cliente: Cliente) {
            var totalCentavos = 0

            for (produto in pedido) {
                val preco = precos[produto.lowercase(Locale.getDefault())]
                if (preco != null) {
                    totalCentavos += preco
                } else {
                    throw IllegalArgumentException("Produto não encontrado: $produto")
                }
            }

            if (verificarEstoque(pedido)) {
                Estoque.atualizarEstoque(pedido[0], 1)
                Notificacao.enviarNotificacaoPedidoConcluido(cliente, totalCentavos)
            } else {
                Notificacao.enviarNotificacaoPedidoFalhou(cliente)
            }
        }
    }
}

fun verificarEstoque(pedido: List<String>): Boolean {
    for (produto in pedido) {
        val quantidade = pedido.count { it == produto }
        if (!Estoque.verificarEstoqueSuficiente(produto, quantidade)) {
            return false
        }
    }
    return true
}





