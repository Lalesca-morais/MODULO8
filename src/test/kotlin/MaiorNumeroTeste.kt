import EX1.MaiorNumero
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaiorNumeroTeste {
    val maiorNumero = MaiorNumero()

    @Test
    fun deveMostrarOMenorNumero(){
        val resultado = maiorNumero.encontrarMaisBarato(2.4,4.6,6.2,10.5,3.6)
        assertEquals("O primeiro produto é o mais barato", resultado)
    }
    @Test
    fun deveMostrarONumeroNull(){
        val resultado = maiorNumero.encontrarMaisBarato(null, 4.5, 3.7, 9.7, 2.3)
        assertEquals("Não é permitido números nulos",resultado)
    }
}