package celular;

public class Celular {

    public static void main(String[] args) {
        //cria 1 lista
        ListaDeContatos lista1 = new ListaDeContatos();
        
        //cria 2 contatos
        Contato contato1 = new Contato("Glauber", "123456789");
        Contato contato2 = new Contato("Cleiton", "987654321");
        
        //adiciona contatos na lista
        lista1.adicionarContato(contato1);
        lista1.adicionarContato(contato2);
        
        lista1.removerContato(contato1);
        
        lista1.imprimirLista();
        
    }
    
}
