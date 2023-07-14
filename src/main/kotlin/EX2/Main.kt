package EX2

fun main() {
    val formas = ArrayList<Forma>(5)

    val retangulo = Retangulo(4f, 2f)
    val circulo = Circulo(3f)
    val quadrado = Quadrado(7f,6f)

    formas.add(retangulo)
    formas.add(circulo)
    formas.add(quadrado)


    for (i in 0 until formas.size) {
        val forma = formas[i]
        println("Área: ${forma.calcularArea()}")
        println("Perímetro: ${forma.calcularPerimetro()}")
        println("-----------------------")
    }
}