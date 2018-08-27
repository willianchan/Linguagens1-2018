
package mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        Map<String, Dados> map = new HashMap<>();
        
        map.put("aqui", new Dados(1, "Aqui"));
        map.put("chave2", new Dados(1, "bunda"));
        map.put("aqui", new Dados(5, "goku"));
        
        System.out.println("map: ");
        System.out.println(map);
        
        for(String chave: map.keySet()){
            Dados d = map.get(chave);
            System.out.println("Chave: " + chave);
            System.out.println("Valor: " + d + "\n");
        }
    }
    
}
