package aula4;

public class Aula4 {

    public static void main(String[] args) {

        Conta c1; //Declara variavel do tipo Conta
        c1 = new Conta("21", 240, "Glauber", "Rocha", "412546341"); //Atribui objeto do tipo Conta em uma variavel
        //Conta c1 = new Conta(); Pode ser feito em 1 linha
        c1.setSaldo(100000);

        Conta c2 = new Conta("11", 258, "NELSON", "GAMA", "213564");
        c2.setSaldo(1000);

        //sout + ctrl + space -> atalho para println
        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());

        c1.transferirDinheiro(c2, 5000);

        System.out.println("Saldo c1: " + c1.getSaldo());
        System.out.println("Saldo c2: " + c2.getSaldo());
        Conta c = new Conta("132", 3232, "fdsf", "fdss", "fd");
        int total = Conta.getTotalDeContas();
        
        System.out.println(total);
    }

}
