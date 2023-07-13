package EX6

open class ContaBancaria(val saldo: Double) {
    open fun deposito(valor: Double, empregador: Boolean = false) {
        if (empregador) {
            println("Depósito de R$$valor realizado pelo empregador.")
        } else println("Conta Salário só pode receber depósito do empregador.")
    }
    open fun saque(valor: Double): Double {
        if (valor > saldo){
            println("Saldo insuficiente.")
        }
        return saldo
    }
}
class ContaSalario : ContaBancaria(1100.0) {
    override fun deposito(valor: Double, empregador: Boolean) {
        super.deposito(valor, empregador)
        if (empregador) {
            println("Depósito de R$$valor realizado.")
        }
    }

    override fun saque(valor: Double): Double {
        if (valor > saldo) {
            println("Saldo insuficiente.")
        } else {
            val novoSaldo = saldo - valor
            println("Saque de R$$valor realizado.")
            println("Novo saldo: R$$novoSaldo")
            return novoSaldo
        }
        return saldo
    }
}

class ContaPoupanca : ContaBancaria(0.0) {
    override fun deposito(valor: Double, empregador: Boolean) {
        super.deposito(valor, empregador)
        val novoSaldo = saldo + valor
        println("Depósito de R$$valor realizado.")
        println("Novo saldo: R$$novoSaldo")
    }

    override fun saque(valor: Double): Double {
        if (valor > saldo) {
            println("Saldo insuficiente.")
        } else {
            val novoSaldo = saldo - valor
            println("Saque de R$$valor realizado.")
            println("Novo saldo: R$$novoSaldo")
            return novoSaldo
        }
        return saldo
    }
}

class ContaCorrente : ContaBancaria(0.0) {
    override fun deposito(valor: Double, empregador: Boolean) {
        super.deposito(valor, empregador)
        val novoSaldo = saldo + valor
        println("Depósito de R$$valor realizado.")
        println("Novo saldo: R$$novoSaldo")
    }

    override fun saque(valor: Double): Double {
        if (valor > saldo) {
            println("Saldo insuficiente.")
        } else {
            val novoSaldo = saldo - valor
            println("Saque de R$$valor realizado.")
            println("Novo saldo: R$$novoSaldo")
            return novoSaldo
        }
        return saldo
    }
}
