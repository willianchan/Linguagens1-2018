package ordemdados;

import java.util.ArrayList;
import java.util.Collections;

public class OrdemDados {

    public static void main(String[] args) {
        
        ArrayList<Dados> dados = new ArrayList<Dados>();
        dados.add(new Dados(7, "Bunda") {});
        dados.add(new Dados(2, "Asa Akira"));
        dados.add(new Dados(5, "Alt Shita"));
        
        System.out.println("Dados sem ordem: ");
        System.out.println(dados);
        
        Collections.sort(dados);
        System.out.println("Ordenado: ");
        System.out.println(dados);
    }
    
}
