package EX3

import EX1.MaiorNumero


fun main() {
    val maiorNumero = MaiorNumero()

    println("Digite o primeiro produto:")
    val valor1 = readln().toDoubleOrNull()

    println("Digite o segundo produto:")
    val valor2 = readln().toDoubleOrNull()

    println("Digite o terceiro produto:")
    val valor3 = readln().toDoubleOrNull()

    println("Digite o quarto produto:")
    val valor4 = readln().toDoubleOrNull()

    println("Digite o quinto produto:")
    val valor5 = readln().toDoubleOrNull()

    println(maiorNumero.encontrarMaisBarato(valor1, valor2, valor3, valor4, valor5))
}

