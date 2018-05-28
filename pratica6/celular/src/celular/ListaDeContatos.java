package celular;

import java.util.Iterator;
import java.util.LinkedList;

public class ListaDeContatos implements Imprimivel {

    //Atributos
    LinkedList<Contato> lista = new LinkedList<>();
    //ArrayList<Contato> lista = new ArrayList<>();

    //Metodos
    public void adicionarContato(Contato contato) {
        this.lista.add(contato);
    }

    public void removerContato(String contato) {
        for (Contato contatoAtual : this.lista) {
            if(contatoAtual.getNome().equals(contato)){
                this.lista.remove(contatoAtual);
                break;
            }
            System.out.println("Não Foi Encontrado Nome Na Lista");
        }
    }

    @Override
    public void imprimirLista() {
        Iterator<Contato> i = this.lista.iterator();
        Contato contato;
        while (i.hasNext()) {
            contato = i.next();
            System.out.println("Nome: " + contato.nome);
            System.out.println("Numero: " + contato.numero + "\n");
        }
        System.out.println("------------------------------");
    }

}
