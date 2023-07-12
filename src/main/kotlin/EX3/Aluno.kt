package EX3

class Aluno {
    private var nota1: Double = 0.0
    private var nota2: Double = 0.0
    private var nota3: Double = 0.0
    private var nota4: Double = 0.0

    fun setNota1(nota: Double) {
        if (nota1 >= 0){
            if (nota in 0.0..10.0) {
                nota1 = nota
            } else {
                throw IllegalArgumentException("Insira uma nota entre 0 e 10.")
            }
        }else println("Insira uma nota válida!")
    }

    fun setNota2(nota: Double) {
        if (nota2 >= 0){
            if (nota in 0.0..10.0) {
                nota2 = nota
            } else {
                throw IllegalArgumentException("Insira uma nota entre 0 e 10.")
            }
        }else println("Insira uma nota válida!")
    }

    fun setNota3(nota: Double) {
        if (nota3 >= 0){
            if (nota in 0.0..10.0) {
                nota3 = nota
            } else {
                throw IllegalArgumentException("Insira uma nota entre 0 e 10.")
            }
        }else println("Insira uma nota válida!")
    }

    fun setNota4(nota: Double) {
        if (nota4 >= 0){
            if (nota in 0.0..10.0) {
                nota4 = nota
            } else {
                throw IllegalArgumentException("Insira uma nota entre 0 e 10.")
            }
        }else println("Insira uma nota válida!")
    }

    fun calculoMediaSemestral(): Double {
        return (nota1 + nota2 + nota3 + nota4) / 4
    }
}

