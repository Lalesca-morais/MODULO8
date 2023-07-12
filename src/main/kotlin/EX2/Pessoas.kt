package EX2

class Pessoa {
    var idade: Int = 0
        private set
    var diaNascimento: Int = 0
    var mesNascimento: Int = 0
    var anoNascimento: Int = 0
    var nome: String = ""

    fun calculaIdade(diaAtual: Int, mesAtual: Int, anoAtual: Int) {
        var novaIdade = anoAtual - anoNascimento
        if (mesAtual < mesNascimento || mesAtual == mesNascimento && diaAtual < diaNascimento) {
            novaIdade--
        }
        this.idade = novaIdade
    }

    fun informaIdade(): Int {
        return idade
    }

    fun informaNome(): String {
        return nome
    }

    fun ajustaDataDeNascimento(dia: Int, mes: Int, ano: Int) {
        diaNascimento = dia
        mesNascimento = mes
        anoNascimento = ano
    }

    fun getDiaNascimento(): Int {
        return diaNascimento
    }

    fun getMesNascimento(): Int {
        return mesNascimento
    }

    fun getAnoNascimento(): Int {
        return anoNascimento
    }

    fun getNome(): String {
        return nome
    }
    fun setDiaNascimento(diaNascimento: Int) {
        this.diaNascimento = diaNascimento
    }

    fun setMesNascimento(mesNascimento: Int) {
        this.mesNascimento = mesNascimento
    }

    fun setAnoNascimento(anoNascimento: Int) {
        this.anoNascimento = anoNascimento
    }

    fun setNome(nome: String) {
        this.nome = nome
    }
}



