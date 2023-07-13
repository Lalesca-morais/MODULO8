package EX2

import kotlin.math.PI
abstract class Forma(var lado: Int, var altura:Int) {
    abstract fun calcularArea():Float
    abstract fun calcularPerimetro():Float
}
abstract class Retangulo(val lado: Float, val altura: Float) : Forma() {
    override fun calcularArea(): Float {
        return lado * altura
    }
    override fun calcularPerimetro(): Float {
        return 2 * (lado + altura)
    }
}
class Circulo(val raio: Float) : Forma() {
    override fun calcularArea(): Float {
        return PI.toFloat() * raio * raio
    }
    override fun calcularPerimetro(): Float {
        return 2 * PI.toFloat() * raio
    }
}
class Quadrado(val raio: Float) : Retangulo(lado, altura) {

}
fun main(){
    var formas = arrayOf(5)

}
