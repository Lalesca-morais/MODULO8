package EX5

open class PetShop(val nome: String, val raca: String, val responsavelPeloAnimal: String) {
    open fun exibirInformacoes() {
        println("Nome completo: $nome")
        println("Raça: $raca")
        println("Responsável pelo animal: $responsavelPeloAnimal")
        println("------------------------")
    }
}
class Cachorro(nome: String, raca: String, responsavelPeloAnimal: String) : PetShop(nome, raca, responsavelPeloAnimal) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
    }
    fun cachorroSeMovimentando() {
        println("Andando em 4 patas")
    }
    fun cachorroComendo() {
        println("Comendo bife")
    }
    fun cachorroDormindo(){
        println("Dormindo na cama da Jéssica")
    }
}
class Gato(nome: String, raca: String, responsavelPeloAnimal: String) : PetShop(nome, raca, responsavelPeloAnimal) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
    }
    fun gatoSeMovimentando() {
        println("Andando e saltando em 4 patas")
    }
    fun gatoComendo() {
        println("Comendo whiskas sachê")
    }
    fun gatoDormindo() {
        println("Dormindo na caixa")
    }
}
class Peixe(nome: String, raca: String, responsavelPeloAnimal: String) : PetShop(nome, raca, responsavelPeloAnimal) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
    }

    fun peixeSeMovimentando() {
        println("Nadando")
    }

    fun peixeComendo() {
        println("Comendo ração molhada")
    }

    fun peixeDormindo() {
        println("Dormindo de olho aberto")
    }
}

class Passarinho(nome: String, raca: String, responsavelPeloAnimal: String) : PetShop(nome, raca, responsavelPeloAnimal) {
    override fun exibirInformacoes() {
        super.exibirInformacoes()
    }

    fun passaroSeMovimentando() {
        println("Voando")
    }

    fun passaroComendo() {
        println("Comendo ração")
    }

    fun passaroDormindo() {
        println("Dormindo")
    }
}