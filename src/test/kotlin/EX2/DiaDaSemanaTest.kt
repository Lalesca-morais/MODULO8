package EX2

import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.Test

class DiaDaSemanaTest {
    val diaSemana= DiaDaSemana()

    @Test
    fun verificarDiaSemana(){

        val dia=diaSemana.mostrarDiaDaSemana(8)
        assertEquals( "Segunda-feira", dia)
    }
    @Test
    fun verificarDiaSemanaInvalido(){

        val dia=diaSemana.mostrarDiaDaSemana(-5)
        assertEquals( "Valor inválido", dia)
    }

}