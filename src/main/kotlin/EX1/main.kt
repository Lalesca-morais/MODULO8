package EX1

fun main() {
        println("Digite o preço do primeiro produto:")
        val valor1 = readln().toDoubleOrNull()

        println("Digite o preço do segundo produto:")
        val valor2 = readln().toDoubleOrNull()

        println("Digite o preço do terceiro produto:")
        val valor3 = readln().toDoubleOrNull()

        val produtoMaisBarato = produtoMaisBarato(valor1, valor2, valor3)
        println("O $produtoMaisBarato é o mais barato!")
}

fun produtoMaisBarato(valor1: Double?, valor2: Double?, valor3: Double?): String {
        if (valor1 != null && valor2 != null && valor3 != null) {
                return when {
                        valor1 <= valor2 && valor1 <= valor3 -> "Primeiro produto"
                        valor2 <= valor1 && valor2 <= valor3 -> "Segundo produto"
                        else -> "Terceiro produto"
                }
        } else {
                return "Digite um número válido!"
        }
}