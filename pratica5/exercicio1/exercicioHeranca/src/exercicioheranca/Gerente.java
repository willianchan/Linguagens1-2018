package exercicioheranca;

public class Gerente extends Funcionario {

    //Atributos
    private double valorVendas = 0;

    //Construtor
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    //Getters and Setters
    public double getComissao() {
        return Gerente.calculaBonusExtra() + this.valorVendas * 0.1 + this.salarioBase * 0.5;
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
        Funcionario.totalDeVendas += valor;
    }
    
    public void darAumento(Vendedor vendedor, double salario) {
        vendedor.setSalarioBase(salario);
    }
}
