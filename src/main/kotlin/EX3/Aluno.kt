package EX3

class Aluno {
    private var nota1: Double = 0.0
    private var nota2: Double = 0.0
    private var nota3: Double = 0.0
    private var nota4: Double = 0.0

    fun setNota1(nota: Double) {
        if (nota in 0.0..10.0) {
            nota1 = nota
        } else {
            throw IllegalArgumentException("Insira uma nota entre 0 e 10.")
        }
    }

    fun setNota2(nota: Double) {
        if (nota in 0.0..10.0) {
            nota2 = nota
        } else {
            throw IllegalArgumentException("Insira uma nota entre 0 e 10.")
        }
    }

    fun setNota3(nota: Double) {
        if (nota in 0.0..10.0) {
            nota3 = nota
        } else {
            throw IllegalArgumentException("Insira uma nota entre 0 e 10.")
        }
    }

    fun setNota4(nota: Double) {
        if (nota in 0.0..10.0) {
            nota4 = nota
        } else {
            throw IllegalArgumentException("Insira uma nota entre 0 e 10.")
        }
    }

    fun calculoMediaSemestral(): Double {
        return (nota1 + nota2 + nota3 + nota4) / 4
    }
}

