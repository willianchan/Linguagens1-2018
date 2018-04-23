package exercicioheranca;

public class Vendedor extends Funcionario {
    
    //Atributos
    private Gerente gerente;
    private double valorVendas = 0;

    //Construtor
    public Vendedor(Gerente gerente, String nome, double salarioBase) {
        super(nome, salarioBase);
        this.gerente = gerente;
    }
    
    //Getters and Setters
    public double getComissao() {
        return Vendedor.calculaBonusExtra() + this.valorVendas * 0.02;
    }

    public double getSalarioDoMes() {
        return this.salarioBase + this.getComissao();
    }
    
    ///Metodos
    public void realizaVenda(double valor) {
        this.valorVendas += valor;
        Funcionario.totalDeVendas += valor;
    }
    
}
