package KT7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParillisetJaParittomat {

    public static void main(String[] args) {
        // Luodaan lista numeroista
        List<Integer> numerot = Arrays.asList(12, 33, 47, 84, 15, 22, 59, 80, 66, 79);

        // Filtroidaan parilliset numerot
        List<Integer> parilliset = numerot.stream()
                .filter(numero -> numero % 2 == 0)
                .collect(Collectors.toList());

        // Filtroidaan parittomat numerot
        List<Integer> parittomat = numerot.stream()
                .filter(numero -> numero % 2 != 0)
                .collect(Collectors.toList());

        // Tulostetaan parilliset numerot
        System.out.println("Parittomat numerot:");
        parilliset.forEach(numero -> System.out.println(numero));

        // Tulostetaan parittomat numerot
        System.out.println("Parilliset numerot:");
        parittomat.forEach(numero -> System.out.println(numero));
    }
}
