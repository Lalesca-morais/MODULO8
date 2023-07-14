package EX2

import kotlin.math.PI

abstract class Forma {
    abstract fun calcularArea(): String
    abstract fun calcularPerimetro(): String
}
class Retangulo (val lado:Float,val altura:Float): Forma() {
    override fun calcularArea(): String {
        return "Área do Retangulo - %.2f".format(lado*altura)
    }
    override fun calcularPerimetro(): String {
        return "Perimetro do Retangulo - %.2f".format(2*(lado+altura))
    }
}
class Circulo(val raio: Float) : Forma() {
    override fun calcularArea(): String {
        return "Área do Círculo - %.2f".format(PI.toFloat() * raio * raio)
    }
    override fun calcularPerimetro(): String {
        return "Perímetro do Circulo - %.2f".format(2 * PI.toFloat() * raio)
    }
}
class Quadrado (val lado:Float,val altura:Float): Forma() {
    override fun calcularArea(): String {
        return "Área do quadrado - %.2f".format(lado * altura)
    }

    override fun calcularPerimetro(): String {
        return "Perimetro do quadrado - %.2f".format(2 * (lado + altura))
    }
}
