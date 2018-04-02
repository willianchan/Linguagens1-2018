package testentrada;

import java.util.Scanner;

public class Testentrada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int a = entrada.nextInt();

        System.out.println("Idade informada: " + a);
    }

}
