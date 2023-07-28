package EX1

import EX1.ClassePedidos.Companion.formatarValor

class Cliente(val nome: String, val email: String)
class Notificacao {
    companion object {

        fun obterStatusPedidosConcluidos(): Map<String, StatusDoPedido> {
            return mapOf(
                "Pedido123" to StatusDoPedido.CONCLUIDO,
                "Pedido456" to StatusDoPedido.EM_PREPARACAO,
                "Pedido789" to StatusDoPedido.ENTREGUE
            )
        }

//        fun enviarStatusDoPedido(pedido: String, mensagem: String) {
//            println("Status do pedido $pedido: $mensagem")
//        }

        fun enviarNotificacaoPedidoFalhou(cliente: Cliente) {
            println("Notificação para o cliente: ${cliente.nome}: Seu pedido não foi concluído pois o estoque acabou.")
        }

        fun enviarNotificacaoPedidoConcluido(cliente: Cliente, totalCentavos: Int) {
            println("Notificação para o cliente: ${cliente.nome}: Pedido concluído! Total: ${formatarValor(totalCentavos)}")
        }
    }
}