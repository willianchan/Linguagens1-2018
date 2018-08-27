package botasperdidas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BotasPerdidas {

    public static void main(String[] args) {
        Map<Integer, Dados> map = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {

            int numero = scanner.nextInt();
            String lado = scanner.next();

            if (map.containsKey(numero)) {
                if ("E".equals(lado)) {
                    map.put(numero, new Dados(map.get(numero).getLadoE() + 1, map.get(numero).getLadoD()));
                } else {
                    map.put(numero, new Dados(map.get(numero).getLadoE(), map.get(numero).getLadoD() + 1));
                }

            } else {
                if (lado.equals("E")) {
                    map.put(numero, new Dados(1, 0));
                } else {
                    map.put(numero, new Dados(0, 1));
                }

            }

        }

        int total = 0;
        for (Integer chave : map.keySet()) {
            total += map.get(chave).getMenor();
        }

        System.out.println(total);

        System.out.println(map.keySet());
        System.out.println(map);
    }

}
