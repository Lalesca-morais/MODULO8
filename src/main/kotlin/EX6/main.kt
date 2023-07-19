package EX6

import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main() {
    val novoguardaVolume = GuardaVolume()
    try {
        do {
            println("""
            -----MENU DE OPÇÕES-----
            1 - Guardar peças
            2 - Mostrar todas as peças no guarda-volumes
            3 - Mostrar peças por número de identificação
            4 - Devolver peças
            5 - Sair
            Escolha a opção desejada!
        """)
            when (readln().toIntOrNull()) {
                1 -> {
                    val listaDePecas = ArrayList<Roupas>()

                    println("Digite a marca da peça:")
                    val marca = readln()

                    println("Digite o modelo da peça:")
                    val modelo = readln()

                    listaDePecas.add(Roupas(marca, modelo))

                    val numeroIdentificacao = novoguardaVolume.guardarPecas(listaDePecas)
                    println("Peça guardada com sucesso!\n Número de Identificação: $numeroIdentificacao")
                }

                2 -> novoguardaVolume.mostrarPecas()
                3 -> {
                    println("Digite o número de identificação:")
                    val numeroIdentificacao = readln().toIntOrNull() ?: 0
                    novoguardaVolume.mostrarPecasPorNumeroDeIdentificacao(numeroIdentificacao)
                }

                4 -> {
                    println("Digite o número de identificação:")
                    val numeroIdentificacao = readln().toIntOrNull() ?: 0
                    novoguardaVolume.devolverPecas(numeroIdentificacao)
                }

                5 -> {
                    println("Encerrando o sistema...")
                    return
                }

                else -> println("Opção inválida!")
            }
        } while (true)
    }catch (e: NumberFormatException){
        println(e.message)
    }catch (e: NullPointerException){
        println(e.message)
    }
}

