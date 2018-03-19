package aula4;

public class Conta {

    //GETERS E SETERS
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getcliente() {
        return cliente;
    }

    public void setcliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // ATRIBUTOS DA CLASSE
    String numeroConta;
    Cliente cliente;
    double saldo;

    //METODOS DA CLASSE
    String visualizarSaldo() {
        return Double.toString(this.getSaldo());
    }

    void depositar(double valor) {
        this.saldo += valor;
    }

    boolean sacar(double valor) {
        boolean saida = false;

        if (this.saldo >= valor) {
            this.saldo -= valor;
            saida = true;
        }
        return saida;

    }

    boolean transferirDinheiro(Conta destinatario, double valor) {
        boolean saida = false;

        if (this.sacar(valor)) {
            destinatario.depositar(valor);
            saida = true;
        }
        return saida;
    }
}
