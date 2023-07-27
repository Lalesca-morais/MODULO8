package EX3

import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.Test

class MaiorNumeroTest {
    val maiorNumero= MaiorNumero()

    @Test
    fun testarMaiorNumero() {
        val resultado = maiorNumero.encontrarMaiorNumero(7.5, 2.0, 70.5, 65.3, 2.5)
        assertEquals("O maior numero é 70.5", resultado)
    }
    @Test
    fun testarMaiorNumeroComNull() {
        val resultado = maiorNumero.encontrarMaiorNumero(10.5, null, 2.4, null, 2.5)
        assertEquals("O maior numero é 10.5", resultado)
    }
    @Test
    fun testarMaiorNumeroSendoNull() {
        val resultado = maiorNumero.encontrarMaiorNumero(null, -9.0, -8.5, -1.0, -4.9)
        assertEquals("O maior numero é 0.0", resultado)
    }
}