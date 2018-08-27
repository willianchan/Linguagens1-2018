package arvore;

import java.util.TreeSet;

public class Arvore {

    public static void main(String[] args) {
        
        TreeSet<Dados> tree = new TreeSet<>();
        
        tree.add(new Dados(1, "Bunda"));
        tree.add(new Dados(10, "Cobre"));
        tree.add(new Dados(10, "1"));
        tree.add(new Dados(11, "Thanos"));
        
        System.out.println("Conjunto de dados: ");
        System.out.println(tree);
    }
    
}
