package agendagui;

public class Contato {
    //Atributos
    private String nome;
    private String email;
    private String telefone;
    private String facebook;
    private String intagram;
    private String foto;
    private String geolocalizacao;

    //Construtor
    public Contato(String nome){
        this.nome = nome;
    }

    public String toString(){
        String retorno;
        
        retorno = nome + '\n';
        retorno += "Tel.: " + telefone + "\tEmail: " + email;
        
        return retorno;
    }
    
    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getIntagram() {
        return intagram;
    }

    public void setIntagram(String intagram) {
        this.intagram = intagram;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getGeolocalizacao() {
        return geolocalizacao;
    }

    public void setGeolocalizacao(String geolocalizacao) {
        this.geolocalizacao = geolocalizacao;
    }
    
    
    
    
    
}
