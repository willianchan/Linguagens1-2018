package linguagens1;

public class Conta {
    
    // ATRIBUTOS DA CLASSE
    private String numeroConta;
    private Cliente cliente;
    private double saldo;

    //CONSTRUTOR
    public Conta(String numeroConta, double saldo, String nome, String sobrenome, String cpf) {
        this.numeroConta = numeroConta;
        this.cliente = new Cliente(nome, sobrenome, cpf);
        this.saldo = saldo;
    }

    //GETERS E SETERS
    public String getNumeroConta() {
        return numeroConta;
    }

    public Cliente getcliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //METODOS DA CLASSE

    public void depositar(double valor) {
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
