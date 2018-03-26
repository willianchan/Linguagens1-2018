package linguagens1;

public class Cliente {
    // ATRIBUTOS
    private String nome;
    private String sobrenome;
    private String cpf;

    // CONSTRUTOR
    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    // GETERS AND SETERS
    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    // METODOS
    public boolean mudarCPF(String cpf){
        boolean retorno = false;
        if (validarCPF(cpf)){
            this.cpf = cpf;
            retorno = true;
        }
        return retorno;
             
    }
    
    private boolean validarCPF(String cpf){
            return true;
        }
}