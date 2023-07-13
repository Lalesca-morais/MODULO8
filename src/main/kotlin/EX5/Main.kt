package EX5

fun main() {
    val cachorro1 = Cachorro("Billy", "Bulldog", "João")
    val cachorro2 = Cachorro("Dudu", "Golden Retriever", "Ana")

    val gato1 = Gato("Miau", "Siamês", "Carlos")
    val gato2 = Gato("Bolinha", "Persa", "Maria")

    val peixe1 = Peixe("Niu", "Carpa comum", "Paula")
    val peixe2 = Peixe("Tico", "Dourado do mar", "Pedro")

    val passarinho1 = Passarinho("Piu", "Sabiá", "Maria")
    val passarinho2 = Passarinho("Bibi", "Beija-flor", "Paulo")

    cachorro1.cachorroSeMovimentando()
    cachorro1.cachorroComendo()
    cachorro1.cachorroDormindo()

    println("------------------------")

    cachorro2.cachorroSeMovimentando()
    cachorro2.cachorroComendo()
    cachorro2.cachorroDormindo()

    println("------------------------")

    gato1.gatoSeMovimentando()
    gato1.gatoComendo()
    gato1.gatoDormindo()

    println("------------------------")

    gato2.gatoSeMovimentando()
    gato2.gatoComendo()
    gato2.gatoDormindo()

    println("------------------------")

    passarinho1.passaroSeMovimentando()
    passarinho1.passaroComendo()
    passarinho1.passaroDormindo()

    println("------------------------")

    passarinho2.passaroSeMovimentando()
    passarinho2.passaroComendo()
    passarinho2.passaroDormindo()
}