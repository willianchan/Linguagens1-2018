package olacollections;

import java.util.ArrayList;
import java.util.Collections;

public class OlaCollections {

    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<String>();
        
        nomes.add("teste1");
        nomes.add("teste2");
        nomes.add("goku");
        nomes.add("vegeta");
        nomes.add("teste5");
        
        System.out.println("Sem ordem: ");
        System.out.println(nomes);
        
        Collections.sort(nomes);
        System.out.println("Em ordem: ");
        System.out.println(nomes);
    }
    
}
