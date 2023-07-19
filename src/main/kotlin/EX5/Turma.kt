//package EX5
//
//import java.time.LocalDate
//import java.time.Period
//
//class Turma {
//    private val alunos = mutableSetOf<Aluno>()
//    val diaDeHoje = LocalDate.now()
//
//    private fun calcularIdade(dataNascimento: LocalDate): Int {
//        return Period.between(dataNascimento, diaDeHoje).years
//    }
//
//    fun cadastrarAluno(aluno: Aluno): Boolean {
//        if (alunos.any {it.matricula == aluno.matricula }) {
//            println("Aluno já existente!")
//            return false
//        }
//        alunos.add(aluno)
//        println("Aluno cadastrado com sucesso!")
//        return true
//    }
//
//    fun listarAlunos(){
//        if (alunos.isEmpty()) {
//            println("Nenhum aluno cadastrado.")
//        } else {
//            for (aluno in alunos) {
//                println(aluno)
//            }
//        }
//    }
//
//    fun listarAlunosPeloSobrenome(sobrenome: String){
//        val alunosComSobrenome = alunos.filter { it.nome.split(" ").last() == sobrenome }
//        if (alunosComSobrenome.isEmpty()) {
//            println("Nenhum aluno com o sobrenome '$sobrenome' encontrado.")
//        } else {
//            for (aluno in alunosComSobrenome) {
//                println(aluno)
//            }
//        }
//    }
//
//    fun listarAlunoMaisVelho(){
//        if (alunos.isEmpty()){
//            println("Nenhum aluno cadastrado!")
//        }else{
//            val alunoMaisVelho = alunos.maxByOrNull { it.dataNascimento }
//            println("Aluno mais idoso:")
//            alunoMaisVelho?.let {
//                println("Matrícula: ${it.matricula}, Nome: ${it.nome}, Data de Nascimento: ${it.dataNascimento}, Sexo: ${it.sexo}")
//            }
//        }
//    }
//
//    fun calcularMediaIdadeAlunos(): Double {
//        if (alunos.isEmpty()) {
//            println("Nenhum aluno cadastrado.")
//            return 0.0
//        }else{
//            val totalAlunos = alunos.size
//            val somaIdades = alunos.map { calcularIdade(it.dataNascimento) }.sum()
//            return somaIdades.toDouble() / totalAlunos
//        }
//    }
//
//    fun atualizarAluno(matricula: Int, novoAluno: Aluno) {
//
//        val matricula = alunos.indexOfFirst { it.matricula == matricula }
//        if (matricula != -1) {
//            alunos.add(novoAluno)
//            println("Aluno atualizado com sucesso!")
//        } else {
//            println("Aluno com matrícula $matricula não encontrado!")
//        }
//    }
//
//    fun removerAluno(matricula: Int) {
//        println("Digite a matrícula do aluno que deseja remover: ")
//        val matricula = readln().toInt()
//
//        val alunoRemovido = alunos.removeIf { it.matricula == matricula }
//        if (alunoRemovido) {
//            println("Aluno com matrícula $matricula removido.")
//        } else {
//            println("Aluno com matrícula $matricula não encontrado.")
//        }
//    }
//}
//
//
//
//
