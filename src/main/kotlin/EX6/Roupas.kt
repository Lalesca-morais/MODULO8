package EX6

class Roupas(marca: String, modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
       println("Peça retirada com sucesso!")
    }
}