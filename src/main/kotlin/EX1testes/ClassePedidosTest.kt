package EX1testes


import EX1.ClassePedidos
import EX1.verificarEstoque
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.lang.IllegalArgumentException

class ClassePedidosTest {

    private val estoque = mutableMapOf<String, Int>()

    @Test
    fun deveCalcularTotalPedido() {
        val pedido = listOf("maçã", "maçã", "laranja", "maçã")

        val resultado = ClassePedidos.calcularTotal(pedido)
        assertEquals("$2.05", resultado)
    }

    @Test
    fun deveFormatarMenorQue100(){
        val centavos = 50
        val resultado1 = ClassePedidos.formatarValor(centavos)
        assertEquals("\$0.50", resultado1)
    }

    @Test
    fun deveFormatarIgualA100(){
        val centavos = 170
        val resultado2 = ClassePedidos.formatarValor(centavos)
        assertEquals("\$1.70", resultado2)
    }

    @Test
    fun deveFormatarMaiorQue100(){
        val centavos = 450
        val resultado3 = ClassePedidos.formatarValor(centavos)
        assertEquals("\$4.50", resultado3)
    }

    @Test
    fun deveFazerPedidoComprasSimples() {
        val pedido = listOf("maçã", "maçã", "laranja", "maçã")
        val resultado4 = ClassePedidos.calcularTotal(pedido)
        assertEquals("$2.05", resultado4)
    }

    @Test
    fun deveFazerPedidoCompreUmLeveOutro() {
        val pedido = listOf("maçã", "maçã")
        val resultado5 = ClassePedidos.calcularTotal(pedido)
        assertEquals("$1.20", resultado5)
    }

    @Test
    fun deveFazerPedido3Por2(){
        val pedido = listOf("laranja", "laranja", "laranja")
        val resultado6 = ClassePedidos.calcularTotal(pedido)
        assertEquals("$0.50", resultado6)
    }

    @Test
    fun deveMostrarProdutoNaoEncontrado(){
        val pedido = listOf("banana", "maca")
        try{
            ClassePedidos.calcularTotal(pedido)
        }catch (e: IllegalArgumentException){
            assertEquals("Produto não encontrado: banana", e.message)
        }
    }

    @Test
    fun deveVerificarEstoquePedidoVazio(){
        val pedido = emptyList<String>()
        val resultado = verificarEstoque(pedido)
        assertTrue(resultado)
    }

    @Test
    fun deveVerificarEstoqueSuficiente(){
        estoque["produto1"] = 50
        estoque["produto2"] = 30
        estoque["produto3"] = 12
        val pedido = listOf("produto1", "produto2", "produto3")

        val resultado = verificarEstoque(pedido)
        assertFalse(resultado)
    }

    @Test
    fun deveVerificarEstoqueInsuficiente(){
        estoque["produto1"] = 2
        estoque["produto2"] = 5
        estoque["produto3"] = 0
        val pedido = listOf("produto1", "produto2", "produto3")

        val resultado = verificarEstoque(pedido)
        assertFalse(resultado)
    }

    @Test
    fun deveVerificarEstoqueProdutoNaoExiste(){
        estoque["produto1"] = 5
        val pedido = listOf("produto1", "produto30")
        val resultado = verificarEstoque(pedido)
        assertFalse(resultado)
    }

}


