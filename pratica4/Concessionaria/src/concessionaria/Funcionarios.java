package concessionaria;

public class Funcionarios {

    //Atributos
    private final String nome;
    private double salarioBase;
    private double valorVendas;
    private Gerente gerente;

    private static int totalDeFuncionarios;
    private static double totalDeVendas;

    //Construtor
    public Funcionarios(String nome, double salarioBase, Gerente gerente) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.gerente = gerente;

        Funcionarios.totalDeFuncionarios = Funcionarios.totalDeFuncionarios + 1;
    }

    //Getters and Setters
    public static int getTotalDeFuncionarios() {
        return Funcionarios.totalDeFuncionarios;
    }

    public double getComissao() {
        return 0.05 * Funcionarios.totalDeVendas / Funcionarios.totalDeFuncionarios;
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

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    ///Metodos
    public void realizaVenda(double valor) {
        this.valorVendas += valor;
        Funcionarios.totalDeVendas += valor;
    }
}
