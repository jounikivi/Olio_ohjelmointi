package KT7;

import java.util.*;
import java.util.stream.Collectors;

public class DeklaratiivinenOhjelmointi {

    public static void main(String[] args) {
        // Luodaan lista numeroista
        List<Integer> numerot = Arrays.asList(12, 33, 47, 84, 15, 22, 59, 80, 66, 79);

        // Etsitään parilliset numerot
        System.out.println(numerot.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList()));
    }
}

