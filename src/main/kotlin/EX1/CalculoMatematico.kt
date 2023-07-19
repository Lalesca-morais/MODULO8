package EX1

class CalculoMatematico {
    fun divisao(valorA:Int, valorB:Int): Int{
        return try {
            valorA / valorB
        } catch (e: ArithmeticException) {
            println("Erro: ${e.javaClass.name}")
            println()
            println("A operação não pode ser realizada!")
            println()
            0
        }
    }
}