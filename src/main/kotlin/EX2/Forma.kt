package EX2

import kotlin.math.PI
abstract class Forma(var lado: Int, var altura: Int) {
    abstract fun calcularArea(): Float
    abstract fun calcularPerimetro(): Float
}
open class Retangulo(val lado: Float, val altura: Float) : Forma(lado.toInt(), altura.toInt()) {
    override fun calcularArea(): Float {
        return lado * altura
    }

    override fun calcularPerimetro(): Float {
        return 2 * (lado + altura)
    }
}
class Circulo(val raio: Float) : Forma(0, 0) {
    override fun calcularArea(): Float {
        return PI.toFloat() * raio * raio
    }

    override fun calcularPerimetro(): Float {
        return 2 * PI.toFloat() * raio
    }
}
class Quadrado(lado: Float) : Retangulo(lado, altura) {}
