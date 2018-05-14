package celular;
import java.util.Iterator;
import java.util.LinkedList;
        
public class ListaDeContatos implements Imprimivel{
    //Atributos
    LinkedList<Contato> lista = new LinkedList<>();
    
    //Construtor
    public ListaDeContatos(){    
    }

    //Metodos
    public void adicionarContato(Contato contato) {
        this.lista.add(contato);
    }
    
    public void removerContato(Contato contato){
        this.lista.remove(this.lista.indexOf(contato));
    }

    @Override
    public void imprimirLista() {
        Iterator<Contato> i = this.lista.iterator();
        Contato contato;
        while(i.hasNext()){
            contato  = i.next();
            System.out.println("Nome: " + contato.nome);
            System.out.println("Numero: " + contato.numero + "\n");
        }
        System.out.println("------------------------------");
    }
    
}
