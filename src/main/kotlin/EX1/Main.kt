package EX1


fun main() {

    val pedido = listOf("maçã", "maçã", "laranja", "maçã")
    println("Pedido: $pedido")

    try {
        PedidoService.processarPedido(pedido, Cliente("Nome do Cliente", "cliente@email.com"))
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}