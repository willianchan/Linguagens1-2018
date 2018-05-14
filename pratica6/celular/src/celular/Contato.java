package celular;

public class Contato {

    //Atributos
    public String nome;
    public String numero;

    //Construtor
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
