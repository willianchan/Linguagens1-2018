package celular;

import java.util.Scanner;

public class Celular {
    
    public static void main(String[] args) {
        
        //Scanner
        Scanner sc = new Scanner(System.in);
        
        //Variaveis
        String entrada;
        int sair = 0;
        
        //cria lista de contatos
        ListaDeContatos lista = new ListaDeContatos();
        
        //cria contato
        Contato contato;
        
        //menu
        while (true) {
            if(sair == 1){
                break;
            }
            
            System.out.println("----- MENU - LISTA DE CONTATOS -----");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Visualizar Contatos");
            System.out.println("4. Sair");
            entrada = sc.next();
            
            if (!entrada.equals("1") && !entrada.equals("2") && !entrada.equals("3") && !entrada.equals("4")) {
                System.out.println("Entrada Inválida");
            } else {
                switch (entrada) {
                    case "1":
                        System.out.print("Nome: ");
                        String nome = sc.next();
                        System.out.print("Número: ");
                        String numero = sc.next();
                        
                        contato = new Contato(nome, numero);
                        lista.adicionarContato(contato);
                        
                        break;
                    case "2":
                        System.out.print("Digite o Nome que Deseja Remover: ");
                        nome = sc.next();
                        lista.removerContato(nome);
                        break;
                    case "3":
                        lista.imprimirLista();
                        break;
                    case "4":
                        sair = 1;
                        break;
                }
            }
            
        }
    }
    
}
