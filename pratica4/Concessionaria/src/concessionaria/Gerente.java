package concessionaria;

public class Gerente {

    //Atributos
    private final String nome;
    private double salarioBase;
    private double valorVendas;

    //Construtor
    public Gerente(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    //Getters and Setters
    public double getComissao() {
        return (0.1 * valorVendas + 0.5 * salarioBase);
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public double getSalarioDoMes() {
        return this.salarioBase + this.getComissao();
    }

    public double getValorVendas() {
        return this.valorVendas;
    }

    ///Metodos
    public void realizaVenda(double valor) {
        this.valorVendas += valor;
    }

    public void darAumento(Funcionarios funcionario, double salario) {
        funcionario.setSalarioBase(salario);
    }
}
