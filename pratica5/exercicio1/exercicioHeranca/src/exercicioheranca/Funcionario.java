package exercicioheranca;

public class Funcionario {

    //Atributos
    protected String nome;
    protected double salarioBase;

    protected static int totalDeFuncionarios;
    protected static double totalDeVendas;
    protected static double bonusExtra;

    //Construtor
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;

        Funcionario.totalDeFuncionarios++;
    }

    //Getters and Setters
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public static int getTotalDeFuncionarios() {
        return Funcionario.totalDeFuncionarios;
    }

    //Getters and Setters
    public static double getTotalDeVendas() {
        return Funcionario.totalDeVendas;
    }

    //Métodos
    public static double calculaBonusExtra() {
        return Funcionario.bonusExtra = Funcionario.totalDeVendas * 0.05 / Funcionario.totalDeFuncionarios;
    }
}
