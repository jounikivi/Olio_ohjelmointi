package KT7;

import java.util.Arrays;
import java.util.List;

public class ImperatiivinenOhjelmointi {

    public static void main(String[] args) {
        // Luodaan lista numeroista
        List<Integer> numerot = Arrays.asList(12, 33, 47, 84, 15, 22, 59, 80, 66, 79);

        // Etsitään parilliset numerot
        for (int numero : numerot) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
