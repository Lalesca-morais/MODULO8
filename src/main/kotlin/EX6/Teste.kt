package EX6

import javax.swing.*
import java.awt.*

fun getRainbowColor(index: Int): Color {
    val listaDeCores = arrayOf(Color.RED, Color.ORANGE, Color.GREEN, Color.MAGENTA, Color.CYAN)

    val corIndex = index % listaDeCores.size
    return listaDeCores[corIndex]
}
fun main() {
    val novoguardaVolume = GuardaVolume()

    val frame = JFrame("Menu do Guarda-Volume")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = GridLayout(6, 1)

    val label = JLabel("Escolha a opção desejada!")
    frame.add(label)

    val button1 = JButton("1 - Guardar peças")
    button1.addActionListener {
        val listaDePecas = ArrayList<Roupas>()

        val marca = JOptionPane.showInputDialog("Digite a marca da peça:")
        val modelo = JOptionPane.showInputDialog("Digite o modelo da peça:")

        listaDePecas.add(Roupas(marca, modelo))

        val numeroIdentificacao = novoguardaVolume.guardarPecas(listaDePecas)
        JOptionPane.showMessageDialog(null, "Peça guardada com sucesso!\nNúmero de Identificação: $numeroIdentificacao")
    }
    button1.background = getRainbowColor(0)
    frame.add(button1)

    val button2 = JButton("2 - Mostrar todas as peças no guarda-volumes")
    button2.addActionListener {
        novoguardaVolume.mostrarPecas()
    }
    button2.background = getRainbowColor(1)
    frame.add(button2)

    val button3 = JButton("3 - Mostrar peças por número de identificação")
    button3.addActionListener {
        val numeroIdentificacao = JOptionPane.showInputDialog("Digite o número de identificação:")?.toIntOrNull() ?: 0
        novoguardaVolume.mostrarPecasPorNumeroDeIdentificacao(numeroIdentificacao)
    }
    button3.background = getRainbowColor(2)
    frame.add(button3)

    val button4 = JButton("4 - Devolver peças")
    button4.addActionListener {
        val numeroIdentificacao = JOptionPane.showInputDialog("Digite o número de identificação:")?.toIntOrNull() ?: 0
        novoguardaVolume.devolverPecas(numeroIdentificacao)
    }
    button4.background = getRainbowColor(3)
    frame.add(button4)

    val button5 = JButton("5 - Sair")
    button5.addActionListener {
        println("Encerrando o sistema...")
        frame.dispose()
    }
    button5.background = getRainbowColor(4)
    frame.add(button5)

    frame.pack()
    frame.isVisible = true
}