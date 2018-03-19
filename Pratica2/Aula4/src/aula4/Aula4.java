package aula4;

public class Aula4 {

    public static void main(String[] args) {

        Conta c1; //Declara variavel do tipo Conta
        c1 = new Conta(); //Atribui objeto do tipo Conta em uma variavel
        //Conta c1 = new Conta(); Pode ser feito em 1 linha
        c1.setSaldo(100000);
        
        Conta c2 = new Conta();
        c2.setSaldo(1000);
       
        //sout + ctrl + space -> atalho para println
        System.out.println("Saldo c1: " + c1.visualizarSaldo());
        System.out.println("Saldo c2: " + c2.visualizarSaldo());

        c1.transferirDinheiro(c2, 5000);

        System.out.println("Saldo c1: " + c1.visualizarSaldo());
        System.out.println("Saldo c2: " + c2.visualizarSaldo());

    }

}
